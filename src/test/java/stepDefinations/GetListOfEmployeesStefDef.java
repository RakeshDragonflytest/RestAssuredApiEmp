package stepDefinations;
import static io.restassured.RestAssured.given;

import io.cucumber.cienvironment.internal.com.eclipsesource.json.JsonArray;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.restassured.response.Response;
import utils.ExcelUtils;
import utils.PojoReader;

import org.apache.poi.EncryptedDocumentException;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;


import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;

import com.mongodb.diagnostics.logging.Logger;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;



public class GetListOfEmployeesStefDef {
	
	Response response;
	
	@When("Verify the Complete Response Body of GET List of Employees.")
	public void verify_the_complete_response_body_of_get_list_of_employees() throws IOException {
		//String endUrl=PojoReader.getPrConf().getValue("qa_url");
		response = given().when().get(PojoReader.getUrl());
		//System.out.println(response.asString());
	}

	@Then("Verify the Status Code {int} displayed or not for list of employees.")
	public void verify_the_status_code_displayed_or_not_for_list_of_employees(int arg1) {
	    Assert.assertEquals(response.getStatusCode(),arg1);
	    //System.out.println("the response code "+response.getStatusCode()+"="+arg1);
	}
	@Then("Verify {string} ID field in response body")
	public void verify_id_field_in_response_body(String someKey) throws EncryptedDocumentException, IOException {
		Collection<String> values=new ArrayList();
		 List<String> listId=new ArrayList<String>();
		 someKey="id";
	values.addAll(ExcelUtils.dataWithParticularKeyValues(someKey));
				 response=(Response) given().when()
					.get(PojoReader.getUrl());
		 listId=response.body().jsonPath().getList(someKey);
		 System.out.println(listId);
		 System.out.println(values);
		Assert.assertTrue(listId.equals(values));
		
	    }

	@Then("Verify {string} Name from response body")
public void verify_name_from_response_body(String name) throws EncryptedDocumentException, IOException {
		Collection<String> expectedNames=new ArrayList();
		List<String>actualnames=new ArrayList<String>();
		name="name";
		expectedNames.addAll(ExcelUtils.dataWithParticularKeyValues(name));
		response=given()
				.when()
				.get(PojoReader.getUrl());
		actualnames=response.body().jsonPath().getList(name);
		System.out.println("the actual name are"+actualnames+"equal to "+expectedNames);
		Assert.assertTrue(actualnames.equals(expectedNames));
  
}

	@Then("Verify {string} Designation from response body")
public void verify_designation_from_response_body(String designation) throws EncryptedDocumentException, IOException {
		Collection<String> expectedDesignations=new ArrayList<String>();
		List<String> actualDesignations=new ArrayList<String>();
		designation="designation";
		expectedDesignations.addAll(ExcelUtils.dataWithParticularKeyValues(designation));
		response=given()
				.when()
				
				.get(PojoReader.getUrl());
	
		
		actualDesignations=response.body().jsonPath().getList(designation);
		System.out.println("the actual Designation are"+actualDesignations+"equal to "+expectedDesignations);
		Assert.assertTrue(actualDesignations.equals(expectedDesignations));
   
}
	        
		
		
			
		
	}

	

			
			
	




