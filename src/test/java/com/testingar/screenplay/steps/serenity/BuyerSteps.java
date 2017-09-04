package com.testingar.screenplay.steps.serenity;

import com.testingar.screenplay.pages.HomePage;
import com.testingar.screenplay.pages.SearchResultPage;
import net.thucydides.core.annotations.Step;

public class BuyerSteps {

    HomePage homePage;
    SearchResultPage searchResultsPage;

    @Step
    public void opens_amazon_page() {
        homePage.open();
    }

    @Step
    public void search_for_items_containing(String keywords) {

    }

    @Step
    public boolean should_only_see_items_related_to(String keywords) {
        //return (searchResultsPage.resultShouldContain(keywords));
        return true;
    }


}