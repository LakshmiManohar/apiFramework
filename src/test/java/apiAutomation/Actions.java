package apiAutomation;

import java.util.HashMap;
import java.util.List;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class Actions {
	
	int z_statusCode;
	String z_statusLine;
	String z_body;
	String z_JSONKEY;
	RequestSpecification httpRequest;
	Response response;
	
		
	public void getMethod(String baseURL,String url,String key,String validate) {
		
	     try {
	    	 RestAssured.baseURI = baseURL;	
	    	 httpRequest = RestAssured.given();
	    	 if(key!=null){
	    		
	    		 httpRequest.header("Authorization","Bearer"+" "+key);
	    	 }
			 response = httpRequest.request(Method.GET, url);
			 if(validate!=null) {
	    		 
				 JsonPath jsonEvaluator = response.jsonPath();
				String jsonExpression = jsonEvaluator.getString(validate);
				this.z_JSONKEY = jsonExpression;
	    	 }
			 
			int z_statusCode = response.getStatusCode();
			String z_statusLine = response.getStatusLine();
			String z_body = response.getBody().asString();
			this.z_statusCode = z_statusCode;
			this.z_statusLine =z_statusLine;
			this.z_body=z_body;
	    	 
	     }catch(Exception e){
	    	 
	    	 System.out.println(e.getMessage());	 
	     }
	}
	
	public void getAllHeaders(String baseURL,String url,String key) {
		RestAssured.baseURI = baseURL;
		httpRequest = RestAssured.given();
		if(key!=null){
    		
   		 httpRequest.header("Authorization","Bearer"+" "+key);
   	 }
		response = httpRequest.request(Method.GET, url);
		int z_statusCode = response.getStatusCode();
		String z_statusLine = response.getStatusLine();
		String z_body = response.getBody().asString();
		this.z_statusCode = z_statusCode;
		this.z_statusLine =z_statusLine;
		this.z_body=z_body;
		System.out.println("********************ALL Headers*****************");
		Headers h1= response.getHeaders();
		for(Header s : h1) {
			
			System.out.println(s);
		}
		
		System.out.println("*************************************************");

	}
	
	public void postMethod(String baseURL,String URL,HashMap<String, String> e,String key,String validate) {
		
		try {
		RestAssured.baseURI = baseURL;
		httpRequest = RestAssured.given();
		if(key!=null){
    		
	   		 httpRequest.header("Authorization","Bearer"+" "+key);
	   	 }
		JSONObject oobj = new JSONObject();
		oobj.putAll(e);
		httpRequest.header("Content-Type","application/json");
		httpRequest.body(oobj.toJSONString());
		response = httpRequest.request(Method.POST, URL);
		 if(validate!=null) {
    		 
			 JsonPath jsonEvaluator = response.jsonPath();
			String jsonExpression = jsonEvaluator.getString(validate);
			this.z_JSONKEY = jsonExpression;
    	 }
		int z_statusCode = response.getStatusCode();
		String z_statusLine = response.getStatusLine();
		String z_body = response.getBody().asString();
		this.z_statusCode = z_statusCode;
		this.z_statusLine =z_statusLine;
		this.z_body=z_body;
		}catch(Exception e1) {
			
			System.out.println(e1.getMessage());
		}
		
	}
	
	public void putMethod(String baseURL,String URL,HashMap<String, String> e,String key,String validate) {
		
		try {
		RestAssured.baseURI = baseURL;
		httpRequest = RestAssured.given();
		if(key!=null){
    		
	   		 httpRequest.header("Authorization","Bearer"+" "+key);
	   	 }
		JSONObject oobj = new JSONObject();
		oobj.putAll(e);
		httpRequest.header("Content-Type","application/json");
		httpRequest.body(oobj.toJSONString());
		response = httpRequest.request(Method.PUT, URL);
		 if(validate!=null) {
    		 
			 JsonPath jsonEvaluator = response.jsonPath();
			String jsonExpression = jsonEvaluator.getString(validate);
			this.z_JSONKEY = jsonExpression;
    	 }
		int z_statusCode = response.getStatusCode();
		String z_statusLine = response.getStatusLine();
		String z_body = response.getBody().asString();
		this.z_statusCode = z_statusCode;
		this.z_statusLine =z_statusLine;
		this.z_body=z_body;
		}catch(Exception e1) {
			
			System.out.println(e1.getMessage());
		}
		
	}
	
	public void patchMethod(String baseURL,String URL,HashMap<String, String> e,String key,String validate) {
		
		try {
		RestAssured.baseURI = baseURL;
		httpRequest = RestAssured.given();
		if(key!=null){
    		
	   		 httpRequest.header("Authorization","Bearer"+" "+key);
	   	 }
		JSONObject oobj = new JSONObject();
		oobj.putAll(e);
		httpRequest.header("Content-Type","application/json");
		httpRequest.body(oobj.toJSONString());
		response = httpRequest.request(Method.PATCH, URL);
		 if(validate!=null) {
    		 
			 JsonPath jsonEvaluator = response.jsonPath();
			String jsonExpression = jsonEvaluator.getString(validate);
			this.z_JSONKEY = jsonExpression;
    	 }
		int z_statusCode = response.getStatusCode();
		String z_statusLine = response.getStatusLine();
		String z_body = response.getBody().asString();
		this.z_statusCode = z_statusCode;
		this.z_statusLine =z_statusLine;
		this.z_body=z_body;
		}catch(Exception e1) {
			
			System.out.println(e1.getMessage());
		}
		
	}
}
