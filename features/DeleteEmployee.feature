Feature: This feature is delete the existing employee.
@smoke
  Scenario: Verify Delete employee request
  
    When I send delete request for employee
    Then I Verify the response code 200 for the DELETE request