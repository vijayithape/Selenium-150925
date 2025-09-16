package com.pomp.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import com.pom.LoginPagePFM;

public class LogInTestPFM {
	
	WebDriver driver;
	LoginPagePFM lp=null;	

	public static Logger log = LogManager.getLogger(LogInTestPFM.class);
	
	
	@Test (priority=1)
	public void setUp() {
		try {
			log.warn("Specify the correct location of the driver");
			System.setProperty("web.chrome.driver", "aaa");		
		}
		
		catch (Exception e){
			log.error("Chromedriver location is incorrect");
			e.getMessage();
			e.getStackTrace();			
		}
		driver=new ChromeDriver();
		log.info("Driver launched");
		driver.get("https://demo.automationtesting.in/R.html");
		driver.manage().window().maximize();
		log.info("Browser Opened");
		lp=new LoginPagePFM(driver);		
	}
	@Test (priority=2)
	public void enterData() {
		lp.enterFirstName("Vijay");
		lp.enteLastName("Ithape");
		lp.enteAdress("Pune");
		lp.enteEmail("test1@test.com");
		lp.enteTel("1234567890");
		
		
	}
	

}
