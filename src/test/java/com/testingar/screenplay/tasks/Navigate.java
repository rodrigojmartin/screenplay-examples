package com.testingar.screenplay.tasks;

import com.testingar.screenplay.model.Section;
import com.testingar.screenplay.pages.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Navigate implements Task {

    HomePage homepage;

    @Override
    @Step("{0} navigates to Amazon")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(homepage)
        );
    }

    public static Performable to(String site) {
        return instrumented(Navigate.class);
    }
}
