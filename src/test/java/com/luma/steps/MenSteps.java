package com.luma.steps;

import com.luma.pages.HomePage;
import com.luma.pages.MenPage;
import com.luma.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MenSteps {
    @When("Mouse Hover on Men Menu")
    public void mouseHoverOnMenMenu() throws InterruptedException {
        new HomePage().mouseHoverOnMenMenu();
    }

    @And("Mouse Hover on Bottoms")
    public void mouseHoverOnBottoms() throws InterruptedException {
        new HomePage().mouseHoverOnBottoms();
    }

    @And("Click on Pants")
    public void clickOnPants() throws InterruptedException {
        new HomePage().mouseHoverAndClickOnPants();
    }

    @And("Mouse Hover on product name Cronus Yoga Pant and click on size")
    public void mouseHoverOnProductNameCronusYogaPantAndClickOnSize() throws InterruptedException {
        new MenPage().mouseHoverOnCoronusYogaPantsAndClickOn32();
    }


    @And("Mouse Hover on product name Cronus Yoga Pant and click on colour Black")
    public void mouseHoverOnProductNameCronusYogaPantAndClickOnColourBlack() throws InterruptedException {
        new MenPage().mouseHoverOnCoronusYogaPantsAndClickOnBlack();
    }

    @And("Mouse Hover on product name Cronus Yoga Pant and click on Add To Cart Button")
    public void mouseHoverOnProductNameCronusYogaPantAndClickOnAddToCartButton() throws InterruptedException {
        new MenPage().mouseHoverOnCoronusYogaPantsAndClickOnAddToCart();
    }

    @And("Verify the text {string}")
    public void verifyTheText(String expectedText) {
        Assert.assertEquals(expectedText, new MenPage().getAddedToCartMessage(), "The added to cart message is not displayed");
    }

    @And("Click on shopping cart Link into message")
    public void clickOnShoppingCartLinkIntoMessage() {
        new MenPage().clickOnShoppingCartElement();
    }


    @And("Verify the product name {string}")
    public void verifyTheProductName(String expectedText) {
        Assert.assertEquals(expectedText,new ShoppingCartPage().getCoronusYogaPantText(),"Cronus Yoga Pant text element is not displayed");
    }

    @And("Verify the product size {string}")
    public void verifyTheProductSize(String expectedText) {
        Assert.assertEquals(expectedText,new ShoppingCartPage().getSize32Text(),"'32' text element is not displayed");
    }

    @Then("Verify the product colour {string}")
    public void verifyTheProductColour(String expectedText) {
        Assert.assertEquals(expectedText,new ShoppingCartPage().getColourBlackText(),"'Black' text element is not displayed");
    }


}
