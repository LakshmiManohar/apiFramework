package apiAutomation;

import org.testng.annotations.Test;

import dataManager.data;
import junit.framework.Assert;

public class NewTest extends Actions {
	
	data ddata;
  @Test
  public void testcas001() {
	  
	  ddata = new data();
	  getMethodAuthorization(ddata.baseURL,ddata.user+ddata.Profile,ddata.oauth);
	  System.out.println(ddata.baseURL+ddata.user+ddata.Profile);
      System.out.println(z_statusCode);  
      Assert.assertEquals(200,z_statusCode);
  }
  
  
}
