package main;

import java.util.concurrent.Semaphore;

//Автобусные остановки. На маршруте несколько остановок. На одной
//остановке может останавливаться несколько автобусов одновременно, но не
//более заданного числа.

public class BusStop {
  private static final int BUS_AMOUNT = 5;
  private static final Semaphore SEMAPHORE = new Semaphore(2, true);

  public static void main(String[] args) throws InterruptedException {
    for (int i = 0; i < BUS_AMOUNT; i++) {
      new Thread(new Bus(i + 1)).start();
      Thread.sleep(1000); 
    }
  }

  public static class Bus implements Runnable {
    private int busNumber;

    Bus(int busNumber) {
      this.busNumber = busNumber;
    }

    @Override
    public void run() {
      try {
        SEMAPHORE.acquire();
        System.out.printf("Bus %d drive to bus stop.\n", this.busNumber);
        Thread.sleep(3000);
      } catch (InterruptedException e) {
        throw new Error();
      }

      SEMAPHORE.release();
      System.out.printf("Bus %d left bus stop.\n", this.busNumber);
    }
  }
}