package stepDefinations;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import utils.PojoReader;

public class DeleteEmployeeDef {
	Response response;

@When("I send delete request for employee")
public void i_send_delete_request_for_employee() throws IOException {
	response = given().when().delete(PojoReader.getUrl()+"/104");
}

@Then("I Verify the response code {int} for the DELETE request")
public void i_verify_the_response_code_for_the_delete_request(int code) {
	 Assert.assertEquals(response.getStatusCode(),code);
}
}
