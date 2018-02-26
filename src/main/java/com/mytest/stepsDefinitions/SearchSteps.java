package com.mytest.stepsDefinitions;

import com.mytest.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchSteps {
    public HomePage homePage;
    public SearchSteps(HomePage homePage){
        this.homePage=homePage;
    }
    @Given("^I am on Home Psge$")
    public void iAmOnHomePsge(){
        homePage.verify_home_page();
    }

    @When("^I search for \"([^\"]*)\"$")
    public void iSearchFor(String to_be_searched) {
     homePage.enter_search(to_be_searched);
    }

    @Then("^I can see London  Information$")
    public void iCanSeeLondonInformation()  {
     homePage.verify_info_displayed();
    }
}
