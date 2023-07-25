package com.luma.steps;

import com.luma.pages.GearPage;
import com.luma.pages.HomePage;
import com.luma.pages.OvernightDufflePage;
import com.luma.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class GearSteps {
    @When("User mouse hover on gear menu")
    public void userMouseHoverOnGearMenu() throws InterruptedException {
        new HomePage().mouseHoverOnGearMenu();
    }

    @And("User Click on Bags")
    public void userClickOnBags() throws InterruptedException {
        new HomePage().mouseHoverAndClickOnBags();
    }

    @And("User Click on Product Name Overnight Duffle")
    public void userClickOnProductNameOvernightDuffle() throws InterruptedException {
        new GearPage().clickOnOvernightDuffleElement();
    }

    @And("User Verify the text {string}")
    public void userVerifyTheText(String expectedText) throws InterruptedException {
        Assert.assertEquals(expectedText, new OvernightDufflePage().getAddedToCartMessage());
    }


    @And("User Change Qty {string}")
    public void userChangeQty(String qty) throws InterruptedException {
        new OvernightDufflePage().sendQtyToInputQuantityBox(qty);
    }

    @And("User  Click on ‘Add to Cart’ Button")
    public void userClickOnAddToCartButton() throws InterruptedException {
        new OvernightDufflePage().clickOnOverAddToCartButton();
    }


    @And("User Click on ‘shopping cart’ Link into message")
    public void userClickOnShoppingCartLinkIntoMessage() throws InterruptedException {
        new OvernightDufflePage().shoppingCartAddedMessage();
    }


    @And("User Verify the product name {string}")
    public void userVerifyTheProductName(String expectedText) throws InterruptedException {
        Assert.assertEquals(expectedText, new OvernightDufflePage().getAddedToCartMessage());

    }

    @And("User Verify the Qty is {string}")
    public void userVerifyTheQtyIs(String expectedText) throws InterruptedException {
        Assert.assertEquals(expectedText, new ShoppingCartPage().getInputQty());
    }

    @And("User Verify the product price {string}")
    public void userVerifyTheProductPrice(String expectedText) throws InterruptedException {
        Assert.assertEquals(expectedText, new ShoppingCartPage().getProductPrice());
    }

    @And("User Change Qty to {string}")
    public void userChangeQtyTo(String qty) throws InterruptedException {
        new ShoppingCartPage().sendQtyToUpdateInQuantityBox(qty);
    }

    @And("User Click on ‘Update Shopping Cart’ button")
    public void userClickOnUpdateShoppingCartButton() throws InterruptedException {
        new ShoppingCartPage().clickUpdateShoppingCartButton();
    }

    @Then("Verify the product price {string}")
    public void verifyTheProductPrice(String expectedText) {
        Assert.assertEquals(expectedText, new ShoppingCartPage().getShoppingCartText());
    }
}
