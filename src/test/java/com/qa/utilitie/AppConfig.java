package com.qa.utilitie;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class AppConfig {
	
	public static String getProperty(String key) throws IOException {
		File file=new File("AppConfigurations\\appConfig.properties");
		
		FileInputStream fileInput=new FileInputStream(file);
		
		Properties properties=new Properties();
		
		properties.load(fileInput);
		
		return properties.getProperty(key);
		
	}

}
