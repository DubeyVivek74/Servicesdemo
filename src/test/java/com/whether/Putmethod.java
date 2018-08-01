package com.whether;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;



import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Putmethod {
	
	@Test
	public void postMethods() {
	RequestSpecification spec = 	RestAssured.given();
 spec.header("Content-Type","application/json");
 JSONObject jsn = new JSONObject();
 jsn.put("id", "3");
 jsn.put("title", "TrialforPut");
 jsn.put("author", "Putmethodforupdate");
 
 spec.body(jsn.toJSONString());
 
 Response res = spec.put("http://localhost:3000/posts/3");
int code = res.getStatusCode();
System.err.println("PUT code "+code);
Assert.assertEquals(code, 200,"Code failed for post");
	}

}
