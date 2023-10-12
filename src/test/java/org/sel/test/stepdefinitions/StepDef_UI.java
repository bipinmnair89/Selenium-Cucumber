package org.sel.test.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public final class StepDef_UI {

    public StepDef_UI() {
    }

    @Given("Load the application")
    public void loadApp(){
        Assert.assertTrue(true);
    }

    @Then("Verify the landing page url is as expected")
    public void verifyLandingPageUrl(){
        Assert.assertTrue(true);
    }
}
