package apiAutomation;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Authentication  {
  @Test
  public void f() {
	  
	  //RestAssured.baseURI = " https://www.googleapis.com/gmail/v1/users";
	  RequestSpecification requestSpec = RestAssured.given();
	  requestSpec.header("Authorization","Bearer ya29.GlsCBnOFscnoIsycz0SbPlRefb3wzQzfJ3QoLWdsd9gSFUJGF-9nUdFvZE5TyUdygBMB6m8z6yhxbx_nd9URFE7HhJKgz3WvQ8QV5-6qHHM-UqNzO0PCOGiLxk5-");
	  Response res = requestSpec.get("https://www.googleapis.com/gmail/v1/users/zenqtester7@gmail.com/profile");
	  System.out.println(res.getBody().asString());
	  
	  Headers h = res.getHeaders();
	  for(Header s1:h) {
		  
		  System.out.println(s1);
	  }
	  
  }
}
