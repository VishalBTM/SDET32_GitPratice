package com.crm.comcast.SDET32_GitPratice;

import org.testng.annotations.Test;

public class ClassDTest {

	@Test
	public void demoTest() {
		String browser=System.getProperty("browser");
		String url=System.getProperty("url");
		System.out.println(browser);
		System.out.println(url);
		
		System.out.println("First Push");
		System.out.println("First changed push for jenkins");
		System.out.println("First changed push for jenkins2");
		System.out.println("First changed push for jenkins3");
	

	}
}
