package io.github.toronto22.task.home;

import io.github.toronto22.ui.HomeUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class CloseAdsPopup implements Task {
    public static Performable perform(){
        return Tasks.instrumented(CloseAdsPopup.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(the(HomeUI.CLOSE_ADS_BUTTON), WebElementStateMatchers.isClickable())
                                .andIfSo(
                                        Click.on(HomeUI.CLOSE_ADS_BUTTON)
                                )
        );
    }
}
