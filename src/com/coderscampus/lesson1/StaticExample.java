package com.coderscampus.lesson1;

public class StaticExample {

	// static = belongs to the class, not an instance of the class.
	// non-static(remove static) = belongs to an instance of the class (not the
	// class itself)

	int someNumber = 10;

//	public static void main(String[] args) {
//		if (someNumber > 11) {          // this errors with Cannot make a static reference to the non-static field someNumber
//			System.out.println("Say something.");
//		}
//	}

	public static void main(String[] args) {
		StaticExample StaticObject = new StaticExample();

		if (StaticObject.someNumber > 11) { // Had to add a new instance of StaticExample to make this work
			System.out.println("Say something.");
		}

		Human sofi = new Human();
		sofi.setAge(12);
		System.out.println(sofi.getStageOfLife());

		Human tom = new Human();
		tom.setAge(19);
		System.out.println(tom.getStageOfLife());
	}
}
