package dataManager;

public class data {

	ConfigManager conf = new ConfigManager("Sys");
	public String oauth = conf.getProperty("oauth");
	public String user = conf.getProperty("user");
	public String baseURL = conf.getProperty("BaseURL");
	public String Profile = conf.getProperty("Profile");

}
