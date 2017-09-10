package com.testingar.screenplay.steps;
import com.testingar.screenplay.model.Section;
import com.testingar.screenplay.questions.TheResults;
import com.testingar.screenplay.tasks.Navigate;
import com.testingar.screenplay.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Steps;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.containsString;

public class SearchByKeywordStepsDefinition {

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^that (.*) wants to buy cool stuff in Amazon$")
    public void wants_to_buy_cool_stuff_in_Amazon(String personaName) throws Throwable {
        theActorCalled(personaName).attemptsTo(
                Navigate.to(Section.Amazon)
        );
    }

    @When("^(?:he|she) searches for items containing (.*)$")
    public void searches_for_items_containing(String keywords) throws Throwable {
        theActorInTheSpotlight().attemptsTo(
                Search.byKeywords(keywords)
        );
    }

    @Then("^(?:he|she) should only see items related to (.*)$")
    public void should_only_see_items_related(String keywords) throws Throwable {
        theActorInTheSpotlight().should(seeThat(TheResults.displayed(), containsString(keywords)));
    }


}
