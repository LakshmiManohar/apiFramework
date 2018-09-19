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
	  getMethod("https://reqres.in","/api/users/2",null,"data.first_name");
      System.out.println("StatusCode: "+z_statusCode+"\nstatausLine:"+z_statusLine+"\nBody:"+z_body);
      Assert.assertEquals(200,z_statusCode);
      System.out.println(this.z_JSONKEY);
      Assert.assertEquals("Janet", this.z_JSONKEY);
  }
  
  @Test(description="Post Method",enabled=false)
  public void testcase_002() {
	ddata = new data();
	HashMap<String, String> e = new HashMap<String, String>();
	e.put("Name", ddata.Name);
	e.put("Job", ddata.Job);	  
	postMethod(ddata.BS_2,ddata.EP_2,e, null,null);
	System.out.println("StatusCode: "+z_statusCode+"\nstatausLine:"+z_statusLine+"\nBody:"+z_body);
	Assert.assertEquals(201,z_statusCode);
	
  }
  
  
  @Test(description="PUT Method",enabled=false)
  public void testcase_003() {
	ddata = new data();
	HashMap<String, String> e = new HashMap<String, String>();
	e.put("Name", ddata.Name);
	e.put("Job", ddata.Name);	  
	putMethod(ddata.BS_2,ddata.EP_2,e, null,null);
	System.out.println("StatusCode: "+z_statusCode+"\nstatausLine:"+z_statusLine+"\nBody:"+z_body);
	Assert.assertEquals(200,z_statusCode);
  }
  
  @Test(description="Patch Method",enabled=false)
  public void testcase_004() {
	ddata = new data();
	HashMap<String, String> e = new HashMap<String, String>();
	e.put("Name", ddata.Name);
	e.put("Job", ddata.Name);	  
	patchMethod(ddata.BS_2,ddata.EP_2,e, null,null);
	System.out.println("StatusCode: "+z_statusCode+"\nstatausLine:"+z_statusLine+"\nBody:"+z_body);
	Assert.assertEquals(200,z_statusCode);
  }
  
  @Test(description="All Headers",enabled=false)
  public void testcase_005() {
	  ddata = new data();
	  getAllHeaders(ddata.BS_2,ddata.EP_2, null);
	  
  }

  
}
