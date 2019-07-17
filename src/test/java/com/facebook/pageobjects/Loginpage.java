package com.facebook.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Loginpage {

	public WebDriver driver;
	
	@FindBy(id = "u_0_l")
	WebElement fname;
	
	@FindBy(how=How.NAME, using ="lastname")
	WebElement lname;
	
	@FindBy(id = "u_0_q")
	WebElement mobilenumber;
	
	@FindBy(id = "u_0_x")
	WebElement newpass;
	
	@FindBy(id = "day")
	WebElement days;
	
	@FindBy(id = "month")
	WebElement months;
	
	@FindBy(id = "year")
	WebElement years;
	
	public Loginpage(WebDriver d){
		driver = d;
		PageFactory.initElements(d, this);
	}
	
	public void first(String fname1) {
		fname.sendKeys(fname1);
	}
	
	public void last(String lname1) {
		lname.sendKeys(lname1);
	}
	
	public void mobile(String mobnum) {
		mobilenumber.sendKeys(mobnum);
	}
	
	public void newpass1(String newpassword) {
		newpass.sendKeys(newpassword);
	}
	
	public void days1(String daysss) {
		Select ts = new Select(days);
		ts.selectByValue("7");
		
	}
	
	public void months1(String monthsss) {
		Select ts1 = new Select(months);
		ts1.selectByVisibleText("Apr");
	}
	
	public void years1(String yearsss) {
		Select ts2 = new Select(years);
		ts2.selectByVisibleText("1996");
		
	}
}
