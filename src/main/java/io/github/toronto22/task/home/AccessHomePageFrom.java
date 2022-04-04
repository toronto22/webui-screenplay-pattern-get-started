package io.github.toronto22.task.home;

import io.github.toronto22.WebUrl;
import io.github.toronto22.interaction.browser.Browser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AccessHomePageFrom implements Task {
    public static Performable url(){
            return Tasks.instrumented(AccessHomePageFrom.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(WebUrl.HOME_PAGE),
                Browser.waitForPageLoad()
        );
    }
}
