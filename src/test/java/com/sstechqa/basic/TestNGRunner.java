package com.sstechqa.basic;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGRunner {

	@BeforeSuite
	public static void test1() {

		System.out.println("I am in before suite!!");

	}

	@Test
	public static void testONe() {

		System.out.println("I am in before test method!!");

	}

}
