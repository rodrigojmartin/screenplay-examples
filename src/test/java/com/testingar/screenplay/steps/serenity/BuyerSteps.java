package com.testingar.screenplay.steps.serenity;

import com.testingar.screenplay.pages.HomePage;
import com.testingar.screenplay.pages.SearchResultPage;
import net.thucydides.core.annotations.Step;

import java.util.List;


public class BuyerSteps {

    HomePage homePage;
    SearchResultPage searchResultsPage;

    @Step
    public void opens_amazon_page() {
        homePage.open();
    }

    @Step
    public void search_for_items_containing(String keywords) {
        homePage.searchFor(keywords);
    }

    @Step
    public void should_only_see_items_related_to(String keywords) {
        List<String> resultTitles = searchResultsPage.getResultTitles();
    }


}