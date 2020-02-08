package com.nttdata.teststatic.main;

import com.nttdata.teststatic.util.TestStatic;

public class Application {

	public static void main(String[] args) {

		System.out.println("main method called... ");
		TestStatic testStatic = new TestStatic();
		testStatic.get();
		System.out.println(TestStatic.ageOfMyMind);
	}

}
