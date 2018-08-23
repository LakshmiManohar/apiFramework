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
	
	  Assert.assertEquals(path.getString("data[1].first_name"),"Charles");
	   List <String> s = path.getList("$.data[*].first_name");
	   for(String s1 :s) {
		   
		   System.out.println(s1);
	   }
	  
  }
}
