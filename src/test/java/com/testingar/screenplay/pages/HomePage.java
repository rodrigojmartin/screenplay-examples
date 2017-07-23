package com.testingar.screenplay.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://www.amazon.com/")
public class HomePage extends PageObject {

    @FindBy(css = "input[value='Go']")
    WebElement searchButton;

    @FindBy(css = "#twotabsearchtextbox")
    WebElement searchQuery;

    public void searchFor(String keywords) {
        searchQuery.sendKeys(keywords);
        searchButton.click();
    }
}
