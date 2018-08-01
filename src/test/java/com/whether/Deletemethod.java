package com.whether;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;



import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Deletemethod {
	
	@Test
	public void delMethods() {
	RequestSpecification spec = 	RestAssured.given();
 
 
 Response res = spec.delete("http://localhost:3000/posts/3");
int code = res.getStatusCode();
System.err.println("POST code "+code);
Assert.assertEquals(code, 200,"Code failed for post");
	}

}
