package org.test;

import org.testng.annotations.Test;

public class Sample {
	
	@Test(invocationCount = 5,priority = 3)
	private void tc3() {
		System.out.println("Testcase-3");

	}
	@Test(priority = -10)
	private void tc2() {
		System.out.println("Testcase-2");

	}
	@Test(priority = 5 )
	private void tc1() {
		System.out.println("Testcase-1");
	}
	@Test(enabled = false,priority = -16)
	private void tc5() {
		System.out.println("Testcase-6");

	}
	@Test(priority = 2)
	private void tc4() {
		System.out.println("Testcase-4");

	}
	
}



