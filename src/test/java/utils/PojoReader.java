package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import com.api.restassured.employee.supporters.PropertiesReader;
;

public class PojoReader {
	
	
	 
	 
	public static PropertiesReader getPrConf() throws IOException 
	{
		PropertiesReader prConf=new PropertiesReader("D:\\Rakesh\\MyWorkSpace\\com.api.restassured.employee\\config.properties");
		return prConf;
	}
	public static String getUrl() throws IOException
	{
		 String endUrl=PojoReader.getPrConf().getValue("qa_url");
		 return endUrl;
	}
	//D:\Rakesh\MyWorkSpace\com.api.restassured.employee\config.properties

}
