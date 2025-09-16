package com.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	//WebElement lastName=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	//WebElement addrss=driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
	//WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
	//WebElement tel=driver.findElement(By.xpath("//input[@type='tel']"));
	//WebElement genders=driver.findElement(By.xpath("//input[@name='radiooptions']"));
	//WebElement hobbies=driver.findElement(By.xpath("//input[@type='checkbox']"));
	//WebElement skills=driver.findElement(By.xpath("//select[@id='Skills']"));
	//WebElement countriy=driver.findElement(By.xpath("//select[@id='countries']"));
	
	private WebElement getFirstName() {
		
		return driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	}
    private WebElement getLastName() {
		
		return driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	}
    private WebElement getAddress() {
		
		return driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
	}
    private WebElement getEmail() {
		
		return driver.findElement(By.xpath("//input[@type='email']"));
	}
    private WebElement getTel() {
		
		return driver.findElement(By.xpath("//input[@type='tel']"));
    }
		
	public void enterFirstName(String text) {		
		getFirstName().sendKeys(text);
	}
	public void enterlastName(String text) {		
		getLastName().sendKeys(text);
	}
	public void addrss(String text) {		
		getAddress().sendKeys(text);
	}
	public void email(String text) {		
		getEmail().sendKeys(text);
	}	
	public void tel(String text) {		
		getTel().sendKeys(text);
	}
	public void radio(List<WebElement> genders) {		
	for (WebElement gender: genders) {
		if (gender.getText().equals("Male"));
		gender.click();
	}
	}
	}

