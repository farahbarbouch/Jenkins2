
@edit
Feature: Edit account informations
  As a user I want to edit my account informations
  Background:
    Given the user is on the home page
    When the user clicks on connexion 
    And the user clicks on monCompte
    And the user enters farahbarbouch@outlook.com and 93930595farahfarah
    And the user clicks on login button

  @editInfo
  Scenario Outline: Check the edit informations fonctionnality
    When the user clicks on informations
    And the user edits informations <name> and <lastName> and <mail> and <newPassword>
    And the user enters a correct password <pass>
    And the user clicks on save button
    Then a message "Information mise à jour avec succès." is displayed 

    Examples: 
      | name    | lastName  | mail                            |newPassword             | pass  |
      | frh     | brb       | farahbarbouch@outlook.com       |                        | 93930595farahfarah  |
      | farah{{ |   brb@    | farahbarbouch@outlook.com       |                        | 93930595farahfarah  |
      
      
     
      

 
   
  
      
     
         