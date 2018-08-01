package com.whether;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class static_Methods_RestAssured {

	@Test
	public void testApi() {

		int code = get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22\\").getStatusCode();
		System.err.println("code captured is " + code);
		Assert.assertEquals(code, 200, "Status code didn't matched");
	}

	@Test
	public void testTime() {

		String body = get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22\\").asString();
		long code = get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22\\")	.getTime();
		System.err.println("Time taken is " + code);
		System.err.println("Response body " + body);

	}

}