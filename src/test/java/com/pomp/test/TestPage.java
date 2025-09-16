package com.pomp.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pom.LoginPage;

public class TestPage {
	
		WebDriver driver;
		LoginPage lp=null;
	@BeforeTest
	public void setUp() {
		System.setProperty("we.chrome.driver", "chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		lp =new LoginPage(driver);
			}
		@Test
		public void updatePage() {
			
			lp.enterFirstName("Vijay");
			lp.enterlastName("Ithape");
			lp.addrss("Pune");
			lp.email("test1@test.com");
			lp.tel("1234567890");
		}

}
