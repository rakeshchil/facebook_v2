package com.facebook.testcases;
//import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.facebook.pageobjects.Loginpage;

//import com.facebook.testcases.BaseClass;

public class TC_logintest_001 extends BaseClass {
	@Test
	public void setup1()
	{
		//driver.get(baseclassurl);
		Loginpage obj1 = new Loginpage(driver);
		obj1.first(baseclassname);
		obj1.last(baseclasslname);
		obj1.mobile(baseclassmobile);
		obj1.newpass1(baseclassnewpass);
		obj1.days1(baseclassdate);
		obj1.months1(baseclassmonth);
		obj1.years1(baseclassyear);
		System.out.println("wq");
		
	}
	

}
