package com.testingar.screenplay.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class SearchResultPage extends PageObject {

    @FindBy(css = "h2#s-result-count")
    WebElement resultsCount;

    public boolean resultShouldContain(String keyword) {
        if (resultsCount.getText().contains(keyword)) {
            return true;
        } else {
            return false;
        }
    }
}
