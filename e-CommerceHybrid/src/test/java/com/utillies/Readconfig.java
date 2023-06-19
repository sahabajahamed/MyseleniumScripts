package com.utillies;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Readconfig {

	Properties properties;
	String path="./Configuration/config.properties";

	public  Readconfig() {
		properties =new Properties();
		try {
			FileInputStream fis= new FileInputStream(path);
			properties.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public String getBaseUrl() {
		String value = properties.getProperty("baseurl");
		return value;

	}

	public String getBrowser() {
		String value = properties.getProperty("browser");
		return value;


	}
}
