package dataManager;

public class data {

	ConfigManager conf = new ConfigManager("Sys");
	public String oauth = conf.getProperty("oauth");
	public String user = conf.getProperty("user");
	public String baseURL = conf.getProperty("BaseURL");
	public String Profile = conf.getProperty("Profile");
	public String Name = conf.getProperty("Name");
	public String Job = conf.getProperty("Job");
	public String EP_2 = conf.getProperty("ENDPOINT_2");
	public String BS_2 = conf.getProperty("BASEURL_2");
	

}
