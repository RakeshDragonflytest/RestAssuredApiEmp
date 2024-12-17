Feature: This feature is to validate the post request
@smoke
  Scenario: Verify Post User request
  
    When I Send the request with body to target server
    Then I Verify the response code 201 for the POST request
