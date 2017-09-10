package com.testingar.screenplay.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchResultPage extends PageObject {

    public static Target RESULT_BREADCRUMB =  Target.the("result breadcrumb").located(By.cssSelector("div#searchTemplate"));

}
