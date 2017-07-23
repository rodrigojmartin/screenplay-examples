package com.testingar.screenplay.steps;
import com.testingar.screenplay.steps.serenity.BuyerSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;


public class SearchByKeywordStepsDefinition {

    @Steps
    BuyerSteps buyer;

    @Given("^richard wants to buy cool stuff in Amazon$")
    public void richard_wants_to_buy_cool_stuff_in_Amazon() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        buyer.opens_amazon_page();
    }


    @When("^he search for items containing Sega$")
    public void he_search_for_items_containing_Sega() throws Throwable {
        buyer.search_for_items_containing("Sega");
    }

    @Then("^he should only see items related to Sega$")
    public void he_should_only_see_items_related_to_Sega() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        buyer.should_only_see_items_related_to("Sega");
    }

}