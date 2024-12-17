Feature: This feature is to update existing employee data by PUT request
@smoke
  Scenario: Verify Put employee request
  
    When I send put request for update employee
    Then I Verify the response code 200 for the PUT request
