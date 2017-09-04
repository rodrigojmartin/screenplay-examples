package com.testingar.screenplay.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchResultPage extends PageObject {

    public static Target RESULT_BREADCRUMB =  Target.the("result breadcrumb").located(By.cssSelector("div#searchTemplate"));

}
