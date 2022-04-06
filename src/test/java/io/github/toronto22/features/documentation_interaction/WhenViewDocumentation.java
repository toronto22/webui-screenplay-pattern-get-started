package io.github.toronto22.features.documentation_interaction;

import io.github.toronto22.WebHook;
import io.github.toronto22.model.documentation.NavigationItem;
import io.github.toronto22.task.documentation.AccessDocumentationFrom;
import io.github.toronto22.task.documentation.ViewTutorial;
import io.github.toronto22.ui.DocumentationUI;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class WhenViewDocumentation extends WebHook {
    String documentationTitle = "Tutorial and Components";

    @BeforeEach
    public void accessDocumentationPage(){
        when(kevin).attemptsTo(
                AccessDocumentationFrom.homePage()
        );
    }

    @Test
    public void should_be_able_to_see_documentation_title(){
       then(kevin).attemptsTo(
               Ensure.that(DocumentationUI.TITLE_LABEL).text().containsIgnoringCase(documentationTitle)
       );

    }

    @Test
    public void should_be_able_to_see_ng_bootstrap_tutorial(){
        when(kevin).attemptsTo(
                ViewTutorial.with(NavigationItem.NG_BOOTSTRAP)
        );
        then(kevin).should(
                seeThat(the(DocumentationUI.TUTORIAL_TITLE_LABEL),
                        WebElementStateMatchers.containsText(NavigationItem.NG_BOOTSTRAP))
        );
    }

    @Test
    public void should_be_able_to_see_buttons_tutorial(){
        when(kevin).attemptsTo(
                ViewTutorial.with(NavigationItem.BUTTONS)
        );
        then(kevin).should(
                seeThat(the(DocumentationUI.TUTORIAL_TITLE_LABEL),
                        WebElementStateMatchers.containsText(NavigationItem.BUTTONS))
        );
    }

    @Test
    public void should_be_able_to_see_checkbox_tutorial(){
        when(kevin).attemptsTo(
                ViewTutorial.with(NavigationItem.CHECKBOX)
        );
        then(kevin).should(
                seeThat(the(DocumentationUI.TUTORIAL_TITLE_LABEL),
                        WebElementStateMatchers.containsText(NavigationItem.CHECKBOX))
        );
    }

    @Test
    public void should_be_able_to_see_radio_tutorial(){
        when(kevin).attemptsTo(
                ViewTutorial.with(NavigationItem.RADIO)
        );
        then(kevin).should(
                seeThat(the(DocumentationUI.TUTORIAL_TITLE_LABEL),
                        WebElementStateMatchers.containsText(NavigationItem.RADIO))
        );
    }
    @Test
    public void should_be_able_to_see_dropdown_tutorial(){
        when(kevin).attemptsTo(
                ViewTutorial.with(NavigationItem.DROPDOWN)
        );
        then(kevin).should(
                seeThat(the(DocumentationUI.TUTORIAL_TITLE_LABEL),
                        WebElementStateMatchers.containsText(NavigationItem.DROPDOWN))
        );
    }

    @Test
    public void should_be_able_to_see_input_tutorial(){
        when(kevin).attemptsTo(
                ViewTutorial.with(NavigationItem.INPUTS)
        );
        then(kevin).should(
                seeThat(the(DocumentationUI.TUTORIAL_TITLE_LABEL),
                        WebElementStateMatchers.containsText(NavigationItem.INPUTS))
        );
    }

    @Test
    public void should_be_able_to_see_textarea_tutorial(){
        when(kevin).attemptsTo(
                ViewTutorial.with(NavigationItem.TEXTAREA)
        );
        then(kevin).should(
                seeThat(the(DocumentationUI.TUTORIAL_TITLE_LABEL),
                        WebElementStateMatchers.containsText(NavigationItem.TEXTAREA))
        );
    }
}
