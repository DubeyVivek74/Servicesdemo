package com.whether;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;



import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Postmethod {
	
	@Test
	public void postMethods() {
	RequestSpecification spec = 	RestAssured.given();
 spec.header("Content-Type","application/json");
 JSONObject jsn = new JSONObject();
 jsn.put("id", "4");
 jsn.put("title", "TrialforPost");
 jsn.put("author", "Postmethodforupload");
 
 spec.body(jsn.toJSONString());
 
 Response res = spec.post("http://localhost:3000/posts");
int code = res.getStatusCode();
System.err.println("POST code "+code);
Assert.assertEquals(code, 201,"Code failed for post");
	}

}
