package com.apttesting;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetCall {
	
	Logger log=LogManager.getLogger(GetCall.class);
	
	@Test
	public void getmethod(){
		
		RestAssured.basePath="";
		Response response= RestAssured.given()
									  .when()
									  .get("http://demoqa.com/utilities/weather/city/pune");
		int sc=response.statusCode();
		log.info("Get Status Code");
		System.out.println("StatusCode"+sc);
		Assert.assertEquals(200, sc);
		System.out.println(response.getTime());
		log.info("GetBody");
		System.out.println(response.getBody().asString());
									  
		
		
	}

}
