package payLoad;

import java.util.HashMap;

import dataManager.data;

public class Load1 {
	
	static data ddata;
	
  public static HashMap pay() {
	  
	  ddata = new data();
		HashMap<String, String> e = new HashMap<String, String>();
		e.put("Name", ddata.Name);
		e.put("Job", ddata.Job);
		return e;
  }

}
