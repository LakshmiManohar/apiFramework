package apiAutomation;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import dataManager.data;
import junit.framework.Assert;

public class DemoTestRunner extends Actions {
	
	data ddata;
  @Test(description="Get Method")
  public void testcase_001() {
	  
	  ddata = new data();
	  getMethod(ddata.baseURL,ddata.user+ddata.Profile,ddata.oauth);
      System.out.println("StatusCode: "+z_statusCode+"\nstatausLine:"+z_statusLine+"\nBody:"+z_body);
      Assert.assertEquals(200,z_statusCode);
  }
  
  @Test(description="Post Method")
  public void testcase_002() {
	ddata = new data();
	HashMap<String, String> e = new HashMap<String, String>();
	e.put("Name", ddata.Name);
	e.put("Job", ddata.Job);	  
	postMethod(ddata.BS_2,ddata.EP_2,e, null);
	System.out.println("StatusCode: "+z_statusCode+"\nstatausLine:"+z_statusLine+"\nBody:"+z_body);
	Assert.assertEquals(201,z_statusCode);
  }
  
  
  @Test(description="PUT Method")
  public void testcase_003() {
	ddata = new data();
	HashMap<String, String> e = new HashMap<String, String>();
	e.put("Name", ddata.Name);
	e.put("Job", ddata.Name);	  
	putMethod(ddata.BS_2,ddata.EP_2,e, null);
	System.out.println("StatusCode: "+z_statusCode+"\nstatausLine:"+z_statusLine+"\nBody:"+z_body);
	Assert.assertEquals(200,z_statusCode);
  }
  
  @Test(description="Patch Method")
  public void testcase_004() {
	ddata = new data();
	HashMap<String, String> e = new HashMap<String, String>();
	e.put("Name", ddata.Name);
	e.put("Job", ddata.Name);	  
	patchMethod(ddata.BS_2,ddata.EP_2,e, null);
	System.out.println("StatusCode: "+z_statusCode+"\nstatausLine:"+z_statusLine+"\nBody:"+z_body);
	Assert.assertEquals(200,z_statusCode);
  }
  
  @Test(description="All Headers")
  public void testcase_005() {
	  ddata = new data();
	  getAllHeaders(ddata.BS_2,ddata.EP_2, null);
	  
  }

  
}
