Feature: Search for Products
  As a shopping user
  I would like to buy clothes
  So, would be nice if i could login to finish shopping

  Scenario: Search for a Product
    Given I am on the Home Page
    When I search for the term "dress"
    Then There should be some results
