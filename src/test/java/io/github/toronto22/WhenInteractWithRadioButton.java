package io.github.toronto22;

import io.github.toronto22.interaction.JsClick;
import io.github.toronto22.ui.HomeUI;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import org.junit.jupiter.api.Test;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.GivenWhenThen.then;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class WhenInteractWithRadioButton extends WebHook {

    @Test
    public void should_be_able_to_select_the_radio(){
        kevin.attemptsTo(
                Scroll.to(HomeUI.RADIO_IS_OFF_RADIO).andAlignToBottom(),
                JsClick.on(HomeUI.RADIO_IS_OFF_RADIO)
        );
        then(kevin).should(
                seeThat(the(HomeUI.RADIO_IS_OFF_RADIO), WebElementStateMatchers.isSelected()),
                seeThat(the(HomeUI.RADIO_IS_ON_RADIO), WebElementStateMatchers.isNotSelected())
        );
    }
}
