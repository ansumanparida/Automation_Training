package com.atmecs.apitesting.testscripts;

import java.net.MalformedURLException;
import java.net.URL;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.atmecs.apitesting.testdataprovider.UsersDataProvider;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetApiTest {
	@Test(dataProvider = "usersdata", dataProviderClass = UsersDataProvider.class)
	public void testGetApi(String url, String firstName, String lastName) throws MalformedURLException {
		String requestedUrl = url;
		RequestSpecification request = RestAssured.given();		
		Response response = request.get(new URL(requestedUrl));
		
		int statusCode = response.getStatusCode();
		String body = response.getBody().asString();
		
		JsonPath jsonPath = response.jsonPath();
		
		String actualFirstName = jsonPath.get("data.first_name");
		String actualLastName = jsonPath.get("data.last_name");
		
		//Assertions
		
		Assert.assertEquals(actualFirstName, firstName);
		Assert.assertEquals(actualLastName, lastName);
		Assert.assertEquals(statusCode, 200, "Verify Status Code");
		
		System.out.println("FirstName = " + actualFirstName);
		System.out.println("LastName = " + actualLastName);
		System.out.println("Status Code = " + statusCode);
		System.out.println("Response Body = " + body);
		
	}	
	
}
