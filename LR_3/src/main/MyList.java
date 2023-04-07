package main;

import java.util.*;

/**
 * На базе коллекций реализовать структуру хранения чисел с поддержкой следующих
 * операций: • добавление/удаление числа; • поиск числа, наиболее близкого к
 * заданному (т.е. модуль разницы минимален).
 */

public class MyList {
	private List<Double> list;

	public MyList() {
		list = new ArrayList<>();
	}

	public void add(Double number) {
		list.add(number);
	}

	public void delete(Double number) {
		list.remove(number);
	}

	public Double find(Double number) {
		Iterator iterator = list.iterator();
		Double min = (Double) iterator.next();
		Double closeValue = 0.0;
		
		while (iterator.hasNext()) {
			Double elem = (Double) iterator.next();
			if (Math.abs(elem - number) == 0.0) {
				closeValue = min;
			}
			
			if (Math.abs(elem - number) < Math.abs(min - number)) {
				min = elem;
			}

		}
		return closeValue;
	}

	public void showElements() {
		for (Double num : list) {
			System.out.println(num);
		}
		
	}

}