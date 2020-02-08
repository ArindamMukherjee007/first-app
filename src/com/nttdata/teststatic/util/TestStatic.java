package com.nttdata.teststatic.util;

public class TestStatic {

	private int id; // instance variable is object level

	// static block

	static {
		System.out.println("static block called s");
		TestStatic.ageOfMyMind = 10;
	}

	// static variable
	public static int ageOfMyMind; // static is class level
	// static method
	// static class

	public TestStatic() {
		// TODO Auto-generated constructor stub
	}

	public void get() {
		System.out.println("get called ");
	}

	{
		System.out.println("annonymous block called ");
	}
}
