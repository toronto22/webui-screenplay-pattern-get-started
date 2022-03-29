package io.github.toronto22;

import io.github.toronto22.ui.HomeUI;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import org.junit.jupiter.api.Test;

import static io.github.toronto22.ui.HomeUI.CLOSE_ADS_BUTTON;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.GivenWhenThen.then;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class WhenInteractWithLink extends WebHook{

    @Test
    public void should_be_able_to_click_on_the_button() {
        kevin.attemptsTo(
                Click.on(CLOSE_ADS_BUTTON),
                Scroll.to(HomeUI.DEFAULT_LINK).andAlignToBottom()
        );
        then(kevin).should(
                seeThat(the(HomeUI.DEFAULT_LINK), WebElementStateMatchers.isVisible()),
                seeThat(the(HomeUI.DEFAULT_LINK), WebElementStateMatchers.isClickable())
        );
    }
}
