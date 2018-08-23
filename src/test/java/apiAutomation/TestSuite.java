package apiAutomation;


import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestSuite extends Actions {
  @Test
  public void testcase01() {
	  
	  RestAssured.baseURI = "https://reqres.in/";
	  RequestSpecification requestType = RestAssured.given();
	  Response response = requestType.request(Method.GET,"/api/users?page=2");
	  Assert.assertEquals(response.statusCode(),200,"Incorrect status code");
  }
  
  
 @Test(enabled=true)
 public void testcase02() {
	 
	 
	 RestAssured.baseURI = "https://reqres.in/";
	 RequestSpecification requestType = RestAssured.given();
	 JSONObject param = new JSONObject();
	 param.put("name","Mano122");
	 param.put("job", "SoftwareEngineer11");
	 param.put("id","1245627");
	 param.put("CreatedAt","2018-08-16T12:42:41.817Z");
	 requestType.header("Content-Type","application/JSON");
	 requestType.body(param.toJSONString());
	 Response response = requestType.request(Method.POST,"/api/users");
	 int statusCode = response.getStatusCode();
	 System.out.println(statusCode);
	 System.out.println(response.body().asString());
}
 
 @Test
 public void testcase03() {
	 
	 RestAssured.baseURI ="http://restapi.demoqa.com/customer";
	 RequestSpecification requestType = RestAssured.given();
	 JSONObject requestParams = new JSONObject();
	   requestParams.put("FirstName", "Virende2r1"); // Cast
		requestParams.put("LastName", "Sin2gh1");
		requestParams.put("UserName", "sdimp2l1euser2dd2011");
		requestParams.put("Password", "passwo2rd11");
	 
		requestParams.put("Email",  "sample2e2e26d19@gmail.com");
		requestType.header("Content-Type","application/json");
		requestType.body(requestParams.toJSONString());
		Response res= requestType.post("/register");
		int statusCode = res.getStatusCode();
		System.out.println(statusCode);
		
		System.out.println(res.body().asString());
		
 }


private JSONObject JSONObject() {
	// TODO Auto-generated method stub
	return null;
}
}
