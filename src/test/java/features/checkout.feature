Feature: Finish Checkout
  As a shopping user
  I would like to buy clothes
  So, would be nice if i could login to finish shopping

  Scenario: Finish Checkout
    Given I logged in as "potatomaster@test.com" with password "abc123"
    When I add the product "dress" to the shopping cart
    And finish the Checkout
    Then I should see the finishing Checkout message "Your order on My Store is complete."
