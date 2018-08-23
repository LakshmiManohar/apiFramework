package dataManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class ConfigManager {
	String fileName;
	Properties properties;
	
	ConfigManager(String fileName){
		
		this.fileName = fileName; 
	}
	
	public void loadFile() throws Exception {
		properties = new Properties();
		File file = new File("E:\\TODO\\RestAssured\\ConfigFiles\\"+fileName+".properties");
		FileReader read = new FileReader(file);
		properties.load(read);	
	}
	public String getProperty(String key) {
		try {
		loadFile();
	}catch(Exception e) {
		System.out.println("Not able to Load the Properties File"+e.getMessage());
	}
		String value = properties.getProperty(key);
		return value;
	}

}
