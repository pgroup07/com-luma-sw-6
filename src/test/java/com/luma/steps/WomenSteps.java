package com.luma.steps;

import com.luma.pages.HomePage;
import com.luma.pages.WomenPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WomenSteps {
    @Given("User on home page")
    public void userOnHomePage() {
    }

    @When("Mouse Hover on Women Menu")
    public void mouseHoverOnWomenMenu() throws InterruptedException {
        new HomePage().mouseHoverOnWomenMenu();
    }

    @And("Mouse Hover on Tops")
    public void mouseHoverOnTops() throws InterruptedException {
        new HomePage().mouseHoverOnTops();
    }

    @And("Click on Jackets")
    public void clickOnJackets() throws InterruptedException {
        new HomePage().mouseHoverAndClickOnJackets();
    }

    @And("Select Sort By filter {string}")
    public void selectSortByFilter(String productName) {
        new WomenPage().filterByName(productName);
    }

    @Then("User Verify the products name display in alphabetical order")
    public void userVerifyTheProductsNameDisplayInAlphabeticalOrder() throws InterruptedException {
        Assert.assertEquals(new WomenPage().productListAfterSorting(), new WomenPage().productListBeforeSorting());
    }

    @Then("Verify the products price display in Low to High")
    public void verifyTheProductsPriceDisplayInLowToHigh() throws InterruptedException {
        Assert.assertEquals(new WomenPage().priceListAfterSorting(), new WomenPage().priceListBeforeSorting());
    }
}
