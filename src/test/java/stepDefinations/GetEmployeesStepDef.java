package stepDefinations;

import static io.restassured.RestAssured.given;

import static org.testng.Assert.*;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import utils.PojoReader;

public class GetEmployeesStepDef {
	Response response;

	/*
	 * @Given("^Get the Response for all employees$") public void
	 * get_the_response_for_all_employees() { try { response =
	 * given().when().get("http://localhost:3000/employees");
	 * //System.out.println("Get response is : " + response.asString()); } catch
	 * (Exception e) { // TODO: handle exception } }
	 *
@Then("^I Verify the Response Code as (\\d+)$")
public void i_verify_the_response_code_as(int code) {
	try {
	int statusCode=response.getStatusCode();
		System.out.println("The response code is ..."+code);
		System.out.println("the response code throw response object is "+statusCode);
		Assert.assertEquals(statusCode,code);
		//Assert.assertEquals(statusCode, code);
		} catch (Exception e) {
		
	}
	
}


//\"([^\"]*)\"$
@Then("I Verify the Reponse Status Code text as {string}")
public void i_verify_the_reponse_status_code_text_as(String string) {
	try {
		Assert.assertEquals(response.getStatusLine(), string);
		System.out.println("the response status line is "+response.getStatusLine()+"and status line from feature file is "+string );
	} catch (Exception e) {
		// TODO: handle exception
	}
}



@Then("I Verify the Reponse Type as {string}")
public void i_verify_the_reponse_type_as(String arg1) {
	try {
		Assert.assertEquals(response.getContentType(), arg1);
		System.out.println("the response content type is "+arg1+ "should be same as "+response.getContentType());
	} catch (Exception e) {
		// TODO: handle exception
	}
}*/

@Given("Get the Response for all employees")
public void get_the_response_for_all_employees() {
	try {
		response = given().when().get(PojoReader.getUrl());
		//System.out.println("Get response is : " + response.asString());
	} catch (Exception e) {
		// TODO: handle exception
	}
}
@Then("I Verify the Response Code as {int}")
public void i_verify_the_response_code_as(int  code) {
	try {
		int statusCode=response.getStatusCode();
			System.out.println("The response code is ..."+code);
			System.out.println("the response code throw response object is "+statusCode);
			Assert.assertEquals(statusCode,code);
			//Assert.assertEquals(statusCode, code);
			} catch (Exception e) {
}
}
@Then("I Verify the Reponse Status Code text as {string}")
public void i_verify_the_reponse_status_code_text_as(String string) {
	try {
		Assert.assertEquals(response.getStatusLine(), string);
		System.out.println("the response status line is "+response.getStatusLine()+"and status line from feature file is "+string );
	} catch (Exception e) {
		// TODO: handle exception
	}
}
@Then("I Verify the Reponse Type as {string}")
public void i_verify_the_reponse_type_as(String arg1) {
	try {
		Assert.assertEquals(response.getContentType(), arg1);
		System.out.println("the response content type is "+arg1+ "should be same as "+response.getContentType());
	} catch (Exception e) {
		// TODO: handle exception
	}
}



}
