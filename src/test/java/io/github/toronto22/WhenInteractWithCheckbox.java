package io.github.toronto22;

import io.github.toronto22.interaction.JsClick;
import io.github.toronto22.task.home.CloseAdsPopup;
import io.github.toronto22.ui.HomeUI;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.UncheckCheckbox;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import org.junit.jupiter.api.Test;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.GivenWhenThen.then;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class WhenInteractWithCheckbox extends WebHook {

    @Test
    public void should_be_able_to_check_the_checkbox(){
        kevin.attemptsTo(
                Scroll.to(HomeUI.CHECKED_CHECKBOX).andAlignToBottom(),
                JsClick.on(HomeUI.UNCHECKED_CHECKBOX),
                JsClick.on(HomeUI.CHECKED_CHECKBOX)
        );
        then(kevin).should(
                seeThat(the(HomeUI.UNCHECKED_CHECKBOX), WebElementStateMatchers.isSelected()),
                seeThat(the(HomeUI.CHECKED_CHECKBOX), WebElementStateMatchers.isNotSelected())
        );
    }
}
