package com.coderscampus.lesson1;

public class Human {
	// class variables
	static int CHILD_AGE = 13;
	static int TEENAGER_AGE = 19;
	static int ADULT_AGE = 65;

	// instance variable
	private int age;

	// Getters
	public int getAge() {
		return age;
	}

	// Setters
	public void setAge(int age) {
		if (age < 0 || age > 150) {
			System.out.println("No, No, No, that is not a valid age. A valid age is between 0 and 130.");
			return;
		}
		this.age = age;
	}

	public String getStageOfLife() {
		if (age < CHILD_AGE) {
			return "You are a child.";
		} else if (age < TEENAGER_AGE) {
			return "You are a teenager.";
		} else if (age < ADULT_AGE) {
			return "You are an adult.";
		} else {
			return "You are a senior.";
		}
	}
}
