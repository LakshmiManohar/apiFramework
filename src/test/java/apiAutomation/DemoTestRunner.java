package apiAutomation;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import dataManager.data;
import junit.framework.Assert;

public class DemoTestRunner extends Actions {
	
	data ddata;
  @Test(enabled=false)
  public void f() {
	  
	  ddata = new data();
	  getMethodAuthorization(ddata.baseURL,ddata.user+ddata.Profile,ddata.oauth);
	  System.out.println(ddata.baseURL+ddata.user+ddata.Profile);
      System.out.println(z_statusCode);  
      Assert.assertEquals(200,z_statusCode);
  }
  
  @Test
  public void f1() {
	  
	HashMap<String, String> e = new HashMap<String, String>();
	e.put("name", "morpheus11");
	e.put("job", "leader11");
	  
	postMethod("https://reqres.in","/api/users",e);
	System.out.println(z_statusCode);
  }
  
}
