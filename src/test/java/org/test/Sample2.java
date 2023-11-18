package org.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample2 {
	@Test
	private void tc3() {
		System.out.println("Testcase-3");

	}
	@Test
	private void tc2() {
		System.out.println("Testcase-2");

	}
	@Test
	private void tc1() {
		System.out.println("Testcase-1");

	}
	@BeforeClass
	private void beforealltc() {
		System.out.println("STARTS<<<<<<");

	}
	@AfterClass
	private void afterAllTc() {
		System.out.println("ENDS>>>>>>");

	}
	@BeforeMethod
	private void beforetc() {
		System.out.println("#TC Started");

	}
	@AfterMethod
	private void aftertc() {
		System.out.println("#TC Ends");

	}
}
