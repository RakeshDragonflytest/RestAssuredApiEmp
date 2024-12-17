package utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtils {
	public static List<LinkedHashMap<String,String>> getData(String excelFileName,String sheetName) throws EncryptedDocumentException, IOException
	{
		
		List<LinkedHashMap<String,String>> dataFromExcel=new ArrayList<>();
		System.out.println("iam first");
		Workbook workbook=WorkbookFactory.create(new File("src/test/resources/testdata/emp.xlsx"));
		Sheet sheet=workbook.getSheet(sheetName);
		int totalRows=sheet.getPhysicalNumberOfRows();
		DataFormatter dataFormatter=new DataFormatter();
		List<String> allKeys=new ArrayList<>();
		LinkedHashMap<String,String> mapData;
		for(int i=0;i<totalRows;i++)
		{
			//System.out.println("iam first");
			mapData=new LinkedHashMap<>();
			if(i==0)
			{
				int totalCols=sheet.getRow(0).getPhysicalNumberOfCells();
				for(int j=0;j<totalCols;j++)
				{
					allKeys.add(sheet.getRow(0).getCell(j).getStringCellValue());
				}
			
				}
			else
			{
				int totalCols=sheet.getRow(i).getPhysicalNumberOfCells();
				for(int j=0;j<totalCols;j++)
				{
					String cellValue=dataFormatter.formatCellValue(sheet.getRow(i).getCell(j));
					mapData.put(allKeys.get(j), cellValue);
					
					
				}
				
				dataFromExcel.add(mapData);
				
			}
			}
		System.out.println(dataFromExcel);
		return dataFromExcel;
		
	}
	public static List<String> dataWithParticularKeyValues(String someKey) throws EncryptedDocumentException, IOException
	{
		  List list=new ArrayList();
		List<LinkedHashMap<String,String>> dataFromUtils=new ArrayList<>();
		dataFromUtils.addAll(ExcelUtils.getData("emp.xlsx","Sheet1"));
		String Key=someKey;
		for (LinkedHashMap<String, String> map : dataFromUtils) {
            // Iterate over each key-value pair in the LinkedHashMap
            for (String key : map.keySet()) {
                String value = map.get(key);
                 if(key.equals(Key))
                {
                	System.out.println("the values are"+value);
                	 list.add(value);
                }
               
                
            }
        }
		//System.out.println(list);
		return list;
	}

}
