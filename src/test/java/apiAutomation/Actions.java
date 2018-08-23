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
	String z_successCode;
	RequestSpecification httpRequest;
	Response response;
	
	
/**
 * Get Method 
 * @param url
 */
	public void getMethod(String baseURL,String url) {
		try {
			
			RestAssured.baseURI = baseURL;
		 httpRequest = RestAssured.given();
		 response = httpRequest.request(Method.GET, url);
		int z_statusCode = response.getStatusCode();
		String z_statusLine = response.getStatusLine();
		String z_body = response.getBody().asString();
		this.z_statusCode = z_statusCode;
		this.z_statusLine =z_statusLine;
		this.z_body=z_body;
		
		}
		catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
		
	}
	
	public void getMethodwithValue(String baseURL,String url,String key) {
		
		try {
			RestAssured.baseURI = baseURL;	
		httpRequest = RestAssured.given();
		response = httpRequest.request(Method.GET, url);
		int statusCode = response.getStatusCode();
		String statusLine = response.getStatusLine();
		String body = response.getBody().asString();
		JsonPath jsonEvalutor = response.jsonPath();
		String contentValue = jsonEvalutor.get(key);
		this.z_statusCode = z_statusCode;
		this.z_statusLine =z_statusLine;
		this.z_body=z_body;
		System.out.println(contentValue);
		}
		catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
	}
	
	public void getMethodAuthorization(String baseURL,String url,String key) {
		
	     try {
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
		
		Headers h1= response.getHeaders();
		for(Header s : h1) {
			
			System.out.println();
		}

	}
	
	public void postMethod(String baseURL,String URL,String key,String value) {
		RestAssured.baseURI = baseURL;
		httpRequest = RestAssured.given();
		JSONObject oobj = new JSONObject();
				
				oobj.put(key,value);
		
		httpRequest.body(oobj.toJSONString());
		response = httpRequest.request(Method.POST, URL);
		int statusCode = response.getStatusCode();
		String statusLine = response.getStatusLine();
		String body = response.getBody().asString();
		System.out.println(statusCode);
		System.out.println(statusLine);
		System.out.println(body);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
