Feature: Purpose of this feature is to test GET request for employees

  @t1
  Scenario: GET Request for all employees
    Given Get the Response for all employees
    Then I Verify the Response Code as 200
    Then I Verify the Reponse Status Code text as "HTTP/1.1 200 OK"
    Then I Verify the Reponse Type as "application/json"
    
   
   
