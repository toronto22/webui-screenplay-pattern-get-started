package io.github.toronto22.home_page_interaction;

import io.github.toronto22.WebHook;
import io.github.toronto22.ui.HomeUI;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import org.junit.jupiter.api.Test;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class WhenInteractWithMenu extends WebHook {
    @Test
    public void should_be_able_to_click_on_menu(){
        when(kevin).attemptsTo(
                Scroll.to(HomeUI.MENU_MENU).andAlignToBottom()
        );
        then(kevin).should(
                seeThat(the(HomeUI.MENU_MENU), WebElementStateMatchers.isVisible()),
                seeThat(the(HomeUI.MENU_MENU), WebElementStateMatchers.isClickable())
        );
    }

    @Test
    public void should_be_able_to_click_on_sub_menu(){
        when(kevin).attemptsTo(
                Scroll.to(HomeUI.DROPDOWN_MENU).andAlignToBottom(),
                Click.on(HomeUI.DROPDOWN_MENU)
        );
        then(kevin).should(
                seeThat(the(HomeUI.ANOTHER_ACTION_SUBMENU), WebElementStateMatchers.isVisible()),
                seeThat(the(HomeUI.ANOTHER_ACTION_SUBMENU), WebElementStateMatchers.isClickable())
        );
    }
}
