Feature: Login in the Automation Practice Fake Ecommerce Website
    As a shopping user
    I would like to buy clothes
    So, would be nice if i could login to finish shopping

Scenario: Login Happy
    Given I have a valid user
    When I login in the fake ecommerce
    Then I should see my user logged

Scenario Outline: Invalid login
    Given I try to login with email "<email>" and password "<password>"
    Then I should see the message "<message>"

    Examples:
    |         email         |         password         |         message             |
    | naovai@teste.com      | 123123                   | Authentication failed.      |
    |                       | 1231234                  | An email address required.  |
    |                       |                          | An email address required.  |
    | emptypass@test.com    |                          | Password is required.       |
