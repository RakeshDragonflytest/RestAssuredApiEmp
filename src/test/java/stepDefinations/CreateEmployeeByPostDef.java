package stepDefinations;


import static io.restassured.RestAssured.given;

import java.io.IOException;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utils.PojoReader;
import utils.Pojo_PostRequest;

public class CreateEmployeeByPostDef {
	
	Response response;
	RequestSpecification request;
		@When("I Send the request with body to target server")
	public void i_send_the_request_with_body_to_target_server() throws IOException {
			    Pojo_PostRequest data=new Pojo_PostRequest();
			    data.setId("104");
			    data.setName("Surya");
			    data.setDesignation("SoftwareTestEngineer");
			    data.setLocation("Hyderabad"); 
			    response=given()
				 .contentType("application/json")
				 .body(data)

		.when()
		.post(PojoReader.getUrl());

					    }

		@Then("I Verify the response code {int} for the POST request")
		public void i_verify_the_response_code_for_the_post_request(int code) {
			try {
				int statusCode=response.getStatusCode();
					System.out.println("The response code is ..."+code);
					System.out.println("the response code throw response object is "+statusCode);
					Assert.assertEquals(statusCode,code);
					//Assert.assertEquals(statusCode, code);
					} catch (Exception e) {
		}
		}


}
