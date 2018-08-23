package apiAutomation;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Test1_BasicFeature {
	
	/**
	 * simply checking status Code
	 */
  @Test
  public void teststatusCode() {
	  
	  given().
	  	get("https://reqres.in/api/unknown").
	  then().		
	  	statusCode(200);
	  
  }
  
  @Test
  public void testlogging() {
	  given().
	  	get("https://reqres.in/api/unknown/2").
	  then().
	  	log().all();
  }
}
