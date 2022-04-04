package io.github.toronto22.task.documentation;

import io.github.toronto22.interaction.browser.Browser;
import io.github.toronto22.ui.HomeUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AccessDocumentationFrom implements Task {
    public static Performable homePage(){
        return Tasks.instrumented(AccessDocumentationFrom.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomeUI.DOCUMENTATION_BUTTON),
                Browser.waitForPageLoad()
        );
    }
}
