package com.sas.APIAutomation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class NewTest {
  @Test(description="First API report")
  @Description("Verify API")
  public void f() {
	  Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(response.statusCode());
		System.out.println(response.asString());
		System.out.println(response.getBody().asString());
		System.out.println(response.statusLine());

		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
  }
  
}
