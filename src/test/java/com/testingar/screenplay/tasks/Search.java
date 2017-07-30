package com.testingar.screenplay.tasks;

import com.testingar.screenplay.pages.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.actions.Hit;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * Created by Rodrigo on 7/25/17.
 */
public class Search implements Task {

       private final String keywords;

        public Search(String keywords) {
        this.keywords = keywords;
    }

        @Override
        @Step("{0} search by #keywords")
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Enter.theValue(keywords).into(HomePage.SEARCH_FIELD),
                    Hit.the(Keys.RETURN).into(HomePage.SEARCH_FIELD)
            );
        }

        public static Performable byKeywords(String keywords) {
            return instrumented(Search.class, keywords);
        }
}

