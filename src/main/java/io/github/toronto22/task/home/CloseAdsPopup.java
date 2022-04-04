package io.github.toronto22.task.home;

import io.github.toronto22.ui.HomeUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class CloseAdsPopup implements Task {
    public static Performable perform(){
        return Tasks.instrumented(CloseAdsPopup.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomeUI.CLOSE_ADS_BUTTON)
        );
    }
}
