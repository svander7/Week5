package com.coderscampus.lesson8;

public class StringManipulation {
	
	public static void main (String[] args) {
		
		for (String arg : args) {
			System.out.println(arg);
			
			// 1,2,3,4,5 ect. turn into [0]="1", [1]="2", ect.
			String[] numbersArray = arg.split(",");
			for (String number : numbersArray) {
			System.out.println(number);
			
			
		}
		}
		
	}
}