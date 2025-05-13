Feature: API - Generate random user details

  As a user
  I want to use random user api
  So that I can generate random user details

  @script_author:Kranthi_Kumar
  @scenario:GenerateRandomUserDetails
  Scenario: verify user able to generate random user details
    Given user sets the base url for random user api
    Then check user gets success response from api request
    And user generates the random details from response
