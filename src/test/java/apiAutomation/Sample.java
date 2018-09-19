package apiAutomation;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class Sample {
  @Test
  public void f() {
	  
	  RestAssured.baseURI = "https://reqres.in/";
	  RequestSpecification resp = RestAssured.given();
	  Response res = resp.request(Method.GET,"/api/users?page=2");
	  JsonPath path = res.jsonPath();
	
	 String s = path.getString("data[0].id");
	 System.out.println(s);
	  
  }
}
