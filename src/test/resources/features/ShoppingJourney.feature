@ShoppingJourney
Feature: Shopping Journey

  Scenario: Completing basic shopping journey from adding item on cart to checking out
    Given User is on the home page
    When User adds items to cart
    Then The items should be in the cart
