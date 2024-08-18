Feature: Facebook - Account Login Validation

  As a user
  I want to launch facebook url in browser
  So that I can whether i can perform login task with invalid credentials

  Background:
    Given user has launched facebook url

  @script_author:Kranthi_Kumar
  @app:facebook
  @scenario:verify_facebook_login_page
  Scenario: Validate error message with invalid credentials in facebook login page
    When user validates the page title
    Then user validates the search in google