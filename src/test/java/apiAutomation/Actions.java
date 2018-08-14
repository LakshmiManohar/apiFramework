package apiAutomation;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class Actions {
	
	int z_statusCode;
	String z_statusLine;
	String z_body;
	String z_successCode;
	
/**
 * Get Method 
 * @param url
 */
	public void getMethod(String url) {
		try {
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET, url);
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
	
	public void getMethodwithValue(String url,String key) {
		
		try {
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET, url);
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
	
	/*public void postMethod(String url,String key,String value) {
		
		RequestSpecification httpRequest = RestAssured.given();
		
		String z_successCode = params(key, value);
		Response response = httpRequest.request(Method.POST,url);
		int z_statusCode = response.getStatusCode();
		
		this.z_statusCode = z_statusCode;
		this.z_successCode =z_successCode;
		
	}
	
	public String params(String key,String value) {
		RequestSpecification httpRequest = RestAssured.given();
		Response response =httpRequest.post();
		JSONObject obj = new JSONObject();
		obj.put(key, value);
		httpRequest.body(obj.toJSONString());
		String z_successCode = response.jsonPath().get("SuccessCode");
		return z_successCode;
	
	}*/

}
