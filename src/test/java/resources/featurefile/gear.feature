Feature: Gear Test
  As a user I want to add an overnight duffle bag into shopping cart

  @regression


  Scenario:User should add product successfully to shopping cart
    Given User on home page
    When User mouse hover on gear menu
    And User Click on Bags
    And User Click on Product Name Overnight Duffle
    And User Verify the text "Overnight Duffle"
    And User Change Qty "3"
    And User  Click on ‘Add to Cart’ Button
    And User Verify the text "You added Overnight Duffle to your shopping cart."
    And User Click on ‘shopping cart’ Link into message
    And User Verify the product name "Overnight Duffle"
    And User Verify the Qty is "3"
    And User Verify the product price "$135.00"
    And User Change Qty to "5"
    And User Click on ‘Update Shopping Cart’ button
    Then Verify the product price "$225.00"




