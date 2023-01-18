package com.practicePackage;

import org.testng.annotations.Test;

public class UpdateTest {

	@Test(groups = "smoke")
	public void updateTest()
	{
		System.out.println("update test");
	}
	@Test(groups = "regression")
	public void logout()
	{
		System.out.println("logout");
	}
}
