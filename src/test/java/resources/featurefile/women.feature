Feature: Women Test
  As a user I want to sort product by Name and Price


  @smoke @regression
  Scenario: User should sort the products by Name filter successfully
    Given User on home page
    When Mouse Hover on Women Menu
    And  Mouse Hover on Tops
    And Click on Jackets
#    And Select Sort By filter "Product Name"
    Then User Verify the products name display in alphabetical order

  @sanity @regression
  Scenario: User should sort the products by Price filter successfully
    Given User on home page
    When Mouse Hover on Women Menu
    And  Mouse Hover on Tops
    And Click on Jackets
    And Select Sort By filter "Price"
    Then Verify the products price display in Low to High

