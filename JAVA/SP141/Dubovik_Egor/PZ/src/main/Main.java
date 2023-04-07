package main;

import java.util.*;
import main.*;

//5. Создать объект класса Планета, используя классы Материк, Океан, Остров.
//Методы: вывести на консоль название материка, планеты, количество
//материков.

public class Main {
	public static void main(String args[]) throws Exception {
		Planet eath = new Planet("Eath");
		
		eath.addMainland(new Mainland("Eurasia"));
		eath.addMainland(new Mainland("Africa"));
		eath.addMainland(new Mainland("Australia"));
		
		
		System.out.println(eath.getName());
		System.out.println(eath.getMainlandAmount());
		eath.getAllMainlands();
	}
}


