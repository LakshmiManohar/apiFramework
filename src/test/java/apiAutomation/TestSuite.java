package apiAutomation;


import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSuite extends Actions {
  @Test
  public void f() {
	  
	  getMethod("http://restapi.demoqa.com/utilities/weather/city/Hyderabad");
	  Assert.assertEquals(z_statusCode, 200,"Incorrect Status Code");
      getMethodwithValue("http://restapi.demoqa.com/utilities/weather/city/Hyderabad","Temperature");
      Assert.assertEquals(z_statusCode, 200,"Incorrect Status Code");
  }
}
