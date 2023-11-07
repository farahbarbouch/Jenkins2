
@SortProduct
Feature: Sort products 
  As a user I want to sort products  
Background:
  Given the user is on the home page


  @tag2
  Scenario Outline: check the sort by ascendant price fonctionnality
    When the user enters <type> of product in the search field
    And the user click on Ok button
    And the user select sort by <sortType>
    Then the products are sorted by ascendant price 

    Examples: 
      | type             |  sortType        |
      | crème hydratante |  Prix, croissant |   
          
