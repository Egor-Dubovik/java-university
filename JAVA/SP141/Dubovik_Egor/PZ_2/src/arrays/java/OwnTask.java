package arrays.java;

import java.util.*;
import java.lang.*;

//Найти количество чисел, содержащих только четные цифры, а среди них — количество чисел с
//равным числом четных и нечетных цифр.

public class OwnTask {
	public static void main(String args[]) throws Exception {
		int number;
		System.out.println("Enter number:");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();

		int[] numbersArray = new int[number];
		List<Object> evenNumbers = new ArrayList<>();

		int evenNumbersAmount = 0;
		int oddNumbersAmount = 0;

		numbersArray = fillArray(number, numbersArray);

		for (int num : numbersArray) {
			if (num % 2 == 0) {
				evenNumbersAmount++;
				evenNumbers.add(num);
			}
		}

		for (Object num : evenNumbers) {
			String numStr = num.toString();
			int length = numStr.length();

			if (length > 1) {
				int localEvenAmount = 0;
				int localOddAmount = 0;

				for (int i = 0; i < length; i++) {
					int currentNum = Character.getNumericValue(numStr.charAt(i));
					if (currentNum % 2 == 0)
						localEvenAmount++;
					else
						localOddAmount++;
				}

				if (localEvenAmount == localOddAmount)
					oddNumbersAmount++;

			}
		}


		printArray("numbersArray: ", numbersArray);
		System.out.println("evenNumbersAmount: " + evenNumbersAmount);
		System.out.println("oddNumbersAmount: " + oddNumbersAmount);
	}

	public static int[] fillArray(int amount, int[] array) {
		for (int i = 0; i < amount; i++) {
			array[i] = i;
		}
		return array;
	}

	static void printArray(String message, int array[]) {
//		System.out.println(message + ": [length: " + array.length + "]");
		for (int i = 0; i < array.length; i++) {
			if (i != 0) {
				System.out.print(", ");
			}
			System.out.print(array[i]);
		}
		System.out.println();
	}
}