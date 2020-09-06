Feature: Login in the Automation Practice Fake Ecommerce Website
    As a shopping user
    I would like to buy clothes
    So, would be nice if i could login to finish shopping

Scenario: Login Happy
    Given I have a valid user
    When I login in the fake ecommerce
    Then I should see my user logged