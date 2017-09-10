package com.testingar.screenplay.pages;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.amazon.com/")
public class HomePage extends PageObject {

    public static Target SEARCH_FIELD =  Target.the("search field").locatedBy("#twotabsearchtextbox");

}

