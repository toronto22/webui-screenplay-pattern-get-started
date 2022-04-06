package io.github.toronto22.features.home_page_interaction;

import io.github.toronto22.WebHook;
import io.github.toronto22.ui.HomeUI;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import org.junit.jupiter.api.Test;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class WhenInteractWithNavigation extends WebHook {
    @Test
    public void should_be_able_to_click_on_navigation(){
        when(kevin).attemptsTo(
                Scroll.to(HomeUI.DISCOVER_NAVIGATION)
        );
        then(kevin).should(
                seeThat(the(HomeUI.DISCOVER_NAVIGATION), WebElementStateMatchers.isVisible()),
                seeThat(the(HomeUI.DISCOVER_NAVIGATION), WebElementStateMatchers.isClickable())
        );
    }
}
