package com.api.restassured.employee.testRunner;

import java.io.IOException;
import java.util.ArrayList;

import java.util.LinkedHashMap;
import java.util.List;


import org.apache.poi.EncryptedDocumentException;

import utils.ExcelUtils;



public class ExcelTest {
	public static void main(String args[]) throws EncryptedDocumentException, IOException
	{
		
		ExcelUtils.getData("emp.xlsx","Sheet1");
	}

	

}
