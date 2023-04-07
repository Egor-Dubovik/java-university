package main;

import java.util.*;


public class MainPZ4 {
	public static void main(String args[]) throws Exception {
		 String ourString = "Hello world! it's me!";
		 String subString = "!";
		    String[] splitString = ourString.split(" ");
		    String ourFinalString = new String();

		    for (int i = 0; i < splitString.length; i++) {
		        if (splitString[i].endsWith(subString)) {
		            ourFinalString += splitString[i].concat(" ***** ");
		        } else {
		            ourFinalString += splitString[i].concat(" ");
		        }
		    }

		    System.out.println(ourFinalString);
		    System.out.println();
	}
}



