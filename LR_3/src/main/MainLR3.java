package main;

import java.util.*;
import main.MyList;

public class MainLR3 {
	public static void main(String args[]) throws Exception {
		MyList myList = new MyList();
		myList.add(5.0);
		myList.add(6.0);
		myList.add(7.0);
		myList.add(8.0);
		myList.add(9.0);
		myList.add(10.0);
		myList.add(11.0);
		myList.add(12.0);
		myList.add(13.0);
		myList.add(14.0);
		
		myList.delete(9.0);
		Double min = myList.find(10.0);
		myList.showElements();
		System.out.println("min: " + min);
	}
}


