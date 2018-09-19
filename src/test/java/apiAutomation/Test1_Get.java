package apiAutomation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Test1_Get {
  @Test
  public void testcase1() {
	  
	  RestAssured.baseURI = "https://reqres.in";
	  
	  RequestSpecification requestSpec = RestAssured.given();
	  Response response = requestSpec.request(Method.GET,"/api/users/2");
	  JsonPath jp = response.jsonPath();
	  String s = jp.getString("data.first_name");
	  int statusCode = response.getStatusCode();
	  String statusBody = response.getBody().asString();
	  String statusLine = response.statusLine();
	  System.out.println(statusCode);
	  System.out.println(statusBody);
	  System.out.println(statusLine);
	  System.out.println("-------------------------------------");
  }
  
  @Test(enabled=false)
  public void testcase2() {
	  
	  RestAssured.baseURI = "https://reqres.in";
	  RequestSpecification requestSpec = RestAssured.given();
	  JSONObject params = new JSONObject();
	  params.put("name","Jim1");
	  params.put("job","Techonlogy1");
	  requestSpec.header("Content-Type","application/json");
	 requestSpec.body(params.toJSONString());
	  Response response = requestSpec.request(Method.POST,"/api/users");
	  int statuCode = response.getStatusCode();
	  String statusLine = response.getStatusLine();
	  String statusBody = response.getBody().asString();
	  System.out.println(statuCode);
	  System.out.println(statusBody);
	  System.out.println(statusLine);
	  System.out.println("-------------------------------");
	  
}
  
  @Test(enabled=false)
  public void testcase3() {
	  
	  RestAssured.baseURI = "https://reqres.in";
	  RequestSpecification requestSpec =RestAssured.given();
	  JSONObject params = new JSONObject();
	  params.put("name", "Tom1");
	  params.put("job", "Information Technology1");
	  requestSpec.header("Content-Type","application/json");
	  requestSpec.body(params.toJSONString());
	  Response response = requestSpec.request(Method.PUT,"/api/users/2");
	  int statusCode = response.getStatusCode();
	  String statusLine = response.getStatusLine();
	  String body = response.getBody().asString();
	  System.out.println(statusCode);
	  System.out.println(statusLine);
	  System.out.println(body);
	  System.out.println("-------------------------------");
	  
	  
  }
  
  @Test(enabled=false)
  public void testcase4() {
	  
	  RestAssured.baseURI = "https://reqres.in";
	  RequestSpecification requestSpec = RestAssured.given();
	  JSONObject params = new JSONObject();
	  params.put("name","Jenny");
	  requestSpec.header("Content-Type","application/json");
	  requestSpec.body(params.toJSONString());
	  Response response = requestSpec.request(Method.PATCH,"/api/users/2");
	  int statusCode = response.getStatusCode();
	  String statusLine = response.getStatusLine();
	  String body = response.getBody().asString();
	  System.out.println(statusCode);
	  System.out.println(statusLine);
	  System.out.println(body);
	  System.out.println("-------------------");
	  
  }

 @Test(enabled=false)
 public void testcase5() {
	
	  RequestSpecification requestSpec = RestAssured.given();
	  Response response = requestSpec.request(Method.GET,"/api/users/2");
	  
	  Headers head = response.headers();
	  for(Header h1 :head) {
		  
		  System.out.println(h1.getName()+"="+h1.getValue());
		  
	  }
	  
	  
 }
 
 @Test(enabled=false)
 public void testcase6() {
	 
	 
	  
 }

}
