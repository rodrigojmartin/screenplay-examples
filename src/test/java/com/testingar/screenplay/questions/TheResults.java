package com.testingar.screenplay.questions;

import com.testingar.screenplay.pages.SearchResultPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class TheResults implements Question<String> {

    public static TheResults displayed() {
        return new TheResults();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(SearchResultPage.RESULT_BREADCRUMB).viewedBy(actor).asString();
    }

}


