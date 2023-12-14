package com.coderscampus.lesson2;

import com.coderscampus.lesson1.Human;

public class Lesson2 {
	public String someVariable = "Hello!";

	// Access modifiers = private, public, protected
	public static void main(String[] args) {
		Human trevorPage = new Human();
		trevorPage.setAge(-1);
		System.out.println(trevorPage.getAge());
		trevorPage.setAge(160);
		System.out.println(trevorPage.getAge());
		trevorPage.setAge(36);
		System.out.println(trevorPage.getAge());

		System.out.println(trevorPage.getStageOfLife());

	}

}
