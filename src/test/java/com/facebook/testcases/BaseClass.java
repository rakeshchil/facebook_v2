package com.facebook.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.facebook.utilities.Readconfig;


public class BaseClass {
	
	Readconfig obj = new Readconfig();
	public String baseclassurl = obj.getapplicationurl();
	public String baseclassname = obj.getfname();
	public String baseclasslname = obj.getlname();
	public String baseclassmobile = obj.getmobile();
	public String baseclassnewpass = obj.getnewpass();
	public String baseclassdate = obj.getdate();
	public String baseclassmonth = obj.getmonth();
	public String baseclassyear = obj.getyear();
	public static WebDriver driver;
	
	
	//@Parameters("browser")	
	@BeforeClass
	public void setup() {
		
		//if(br.equals("browser")) {		
		System.setProperty("webdriver.chrome.driver",obj.getchromepath());
		driver = new ChromeDriver();
	//}
		
		
		//else if(br.equals("firefox")) {
		//	System.setProperty("webdriver.gecko.driver", obj.getfirefoxpath());
			//driver = new FirefoxDriver();
		//}
		driver.get(baseclassurl);
		driver.manage().window().maximize();
	}
	
	/*@AfterClass
	public void teardown() {
		driver.quit();
	}*/

}
