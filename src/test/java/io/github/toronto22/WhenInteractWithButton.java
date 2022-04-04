package io.github.toronto22;

import io.github.toronto22.ui.HomeUI;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import org.junit.jupiter.api.Test;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class WhenInteractWithButton extends WebHook{

    @Test
    public void should_be_able_to_click_on_the_button() {
        kevin.attemptsTo(
                Scroll.to(HomeUI.DEFAULT_BUTTON).andAlignToBottom()
        );

        then(kevin).should(
                seeThat(the(HomeUI.DEFAULT_BUTTON), WebElementStateMatchers.isVisible()),
                seeThat(the(HomeUI.DEFAULT_BUTTON), WebElementStateMatchers.isClickable())
        );
    }
}
