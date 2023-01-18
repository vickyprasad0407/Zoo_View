package com.practicePackage;

import org.testng.annotations.Test;

public class CreateTest {
	
	@Test(groups = "smoke")
	public  void create()
	{
		System.out.println("crated test project");
	}
	@Test(groups = "regression")
	 public void login()
	 {
		System.out.println("login");
	 }

}
