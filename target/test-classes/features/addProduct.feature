
@tag
Feature: Add products to cart
  As a user I want to add products to cart
Background:
  Given the user is on the home page
  @addOneProduct
  Scenario: Check add one product to cart
    When the user clicks on add to cart icon
    And the user clicks on order button
    Then the product added is displayed in the cart page 

  
