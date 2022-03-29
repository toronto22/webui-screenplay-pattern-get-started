package io.github.toronto22;

import io.github.toronto22.question.common.input.Input;
import io.github.toronto22.ui.HomeUI;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import org.junit.jupiter.api.Test;

import static io.github.toronto22.ui.HomeUI.CLOSE_ADS_BUTTON;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.GivenWhenThen.then;
import static org.hamcrest.Matchers.equalTo;

public class WhenInteractWithInput extends WebHook{

    @Test
    public void should_be_able_to_send_keys() {
        String inputText = "Toronto22.github.io";
        kevin.attemptsTo(
                Click.on(CLOSE_ADS_BUTTON),
                Scroll.to(HomeUI.DEFAULT_INPUT).andAlignToBottom(),
                Enter.keyValues(inputText).into(HomeUI.DEFAULT_INPUT)
        );
        then(kevin).should(
                seeThat(Input.of(HomeUI.DEFAULT_INPUT).value(),equalTo(inputText))
        );
    }
    @Test
    public void should_have_place_holder() {
        String placeHolderText = "Default";
        kevin.attemptsTo(
                Click.on(CLOSE_ADS_BUTTON),
                Scroll.to(HomeUI.DEFAULT_INPUT).andAlignToBottom()
        );
        then(kevin).should(
                seeThat(Input.of(HomeUI.DEFAULT_INPUT).placeHolderText(),equalTo(placeHolderText))
        );
    }

    @Test
    public void should_show_error_message() {
        String errorMessage = "Sorry, that username's taken. Try another?";
        kevin.attemptsTo(
                Click.on(CLOSE_ADS_BUTTON),
                Scroll.to(HomeUI.ERROR_INPUT).andAlignToBottom()
        );
        then(kevin).should(
                seeThat(Input.of(HomeUI.ERROR_INPUT).errorMessage(),equalTo(errorMessage))
        );
    }
}
