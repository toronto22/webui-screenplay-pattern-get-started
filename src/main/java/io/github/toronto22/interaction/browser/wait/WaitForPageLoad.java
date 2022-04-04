package io.github.toronto22.interaction.browser.wait;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class WaitForPageLoad implements Task {
    public static Performable perform(){
        return Tasks.instrumented(WaitForPageLoad.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        //TODO
    }
}
