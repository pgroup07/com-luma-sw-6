Feature: Men Test

  @sanity

  Scenario: User Should Add Product SuccessFully To Shopping Cart
    Given User on home page
    When  Mouse Hover on Men Menu
    And Mouse Hover on Bottoms
    And Click on Pants
    And Mouse Hover on product name Cronus Yoga Pant and click on size
    And Mouse Hover on product name Cronus Yoga Pant and click on colour Black
    And Mouse Hover on product name Cronus Yoga Pant and click on Add To Cart Button
    And Verify the text "You added Cronus Yoga Pant to your shopping cart."
    And Click on shopping cart Link into message
    And Verify the text "Shopping Cart."
    And Verify the product name "Cronus Yoga Pant"
    And Verify the product size "32"
    Then Verify the product colour "Black"

