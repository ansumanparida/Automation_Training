package com.atmecs.apitesting.testscripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.atmecs.apitesting.testdataprovider.UsersDataProvider;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteApiTest {
	@Test(dataProvider = "usersdata", dataProviderClass = UsersDataProvider.class)
	public void testGetApi(String url, String firstName, String lastName) throws MalformedURLException {
		String requestedUrl = url;
		
		RequestSpecification request = RestAssured.given();
		Response response = request.delete(new URL(requestedUrl)).then().extract().response();
		
		int statusCode = response.getStatusCode();
		
		Assert.assertEquals(statusCode, 204);
		
		System.out.println("Status Code == " + statusCode);

}
}
