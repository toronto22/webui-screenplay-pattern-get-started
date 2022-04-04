package io.github.toronto22.home_page_interaction;

import io.github.toronto22.WebHook;
import io.github.toronto22.question.common.toggle_button.ToggleButtonStatus;
import io.github.toronto22.ui.HomeUI;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.junit.jupiter.api.Test;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.GivenWhenThen.then;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class WhenInteractWithToggleButton extends WebHook {

    @Test
    public void should_be_able_to_select_the_toggle(){
        kevin.attemptsTo(
                Scroll.to(HomeUI.RADIO_IS_OFF_RADIO).andAlignToBottom(),
                Click.on(HomeUI.OFF_TOGGLE_BUTTON),
                Click.on(HomeUI.ON_TOGGLE_BUTTON)
        );
        then(kevin).attemptsTo(
                Ensure.that(ToggleButtonStatus.isOn(HomeUI.OFF_TOGGLE_BUTTON)).isTrue(),
                Ensure.that(ToggleButtonStatus.isOn(HomeUI.ON_TOGGLE_BUTTON)).isFalse()
        );
    }
}
