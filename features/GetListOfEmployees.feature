Feature: Purpose of this feature is to test GET request for employees and validate Response body
@smoke
 Scenario: Verify the GET - List Of Employees Request with reponse
   When Verify the Complete Response Body of GET List of Employees.
   Then Verify the Status Code 200 displayed or not for list of employees.
   Then Verify "id" ID field in response body
   Then Verify "name" Name from response body
   Then Verify "Designation" Designation from response body
      
      