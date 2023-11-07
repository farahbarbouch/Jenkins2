
@Login
Feature: Login
  As a user I want to log in cosmetique.tn website

  @loginValid
  Scenario: Check login with valid credentials
    Given the user is on the home page
    When the user clicks on connexion 
    And the user clicks on monCompte
    And the user enters <email> and <password>
    And the user clicks on login button
    Then the user is on the profil page
    Examples: 
      | email  | password | 
      | farahbarbouch@outlook.com | 93930595farahfarah | 

  @loginInvalidEmail
  Scenario: Check login with invalid email and valid password
    Given the user is on the home page
    When the user clicks on connexion 
    And the user clicks on monCompte
    And the user enters <email> and <password>
    And the user clicks on login button
    Then an error message appears 

    Examples: 
      | email  | password | 
      | fbarbouch@outlook.com | 93930595farah | 
  
  @loginInvalidPassword
  Scenario: Check login with valid email and invalid password
    Given the user is on the home page
    When the user clicks on connexion 
    And the user clicks on monCompte
    And the user enters <email> and <password>
    And the user clicks on login button
    Then an error message appears 

    Examples: 
      | email  | password | 
      | farahbarbouch@outlook.com | 939305 | 
  
  @loginInvalidCredentials
  Scenario: Check login with invalid credentials
    Given the user is on the home page
    When the user clicks on connexion 
    And the user clicks on monCompte
    And the user enters <email> and <password>
    And the user clicks on login button
    Then an error message appears 

    Examples: 
      | email  | password | 
      | fbarbouch@outlook.com | 93930595 | 
