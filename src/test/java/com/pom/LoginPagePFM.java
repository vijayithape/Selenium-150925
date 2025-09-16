package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePFM {
	
	WebDriver driver;
	
	public LoginPagePFM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	private WebElement firstName;
	@FindBy (xpath="//input[@placeholder='Last Name']")
	private WebElement lastName;
	@FindBy (xpath="//textarea[@ng-model='Adress']")
	private WebElement adress;
	@FindBy (xpath="//input[@type='email']")
	private WebElement eMail;
	@FindBy (xpath="//input[@type='tel']")
	private WebElement tel;
	
	public void enterFirstName (String text) {
		firstName.sendKeys(text);
	}
	public void enteLastName (String text) {
		lastName.sendKeys(text);
	}
	public void enteAdress (String text) {
		adress.sendKeys(text);
	}
	public void enteEmail (String text) {
		eMail.sendKeys(text);
	}
	public void enteTel (String text) {
		tel.sendKeys(text);
	}
}
