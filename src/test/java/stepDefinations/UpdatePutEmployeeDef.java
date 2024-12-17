package stepDefinations;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import utils.PojoReader;
import utils.Pojo_PostRequest;

public class UpdatePutEmployeeDef {
	Response response;

@When("I send put request for update employee")
public void i_send_put_request_for_update_employee() throws IOException {
	//String endUrl=PojoReader.getPrConf().getValue("qa_url");
	//String EndURL=PojoReader.getUrl();
	Pojo_PostRequest data=new Pojo_PostRequest();
    data.setId("103");
    data.setName("Rangaa");
    data.setDesignation("Automation Testing ");
    data.setLocation("Hyderabad"); 
	response = given() 
			.contentType("application/json")
			 .body(data)
         .when()
         .put(PojoReader.getUrl()+"/103");
   
}

@Then("I Verify the response code {int} for the PUT request")
public void i_verify_the_response_code_for_the_put_request(int code) {
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
