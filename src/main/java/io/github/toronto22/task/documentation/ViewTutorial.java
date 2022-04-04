package io.github.toronto22.task.documentation;

import io.github.toronto22.interaction.browser.Browser;
import io.github.toronto22.model.documentation.NavigationItem;
import io.github.toronto22.ui.DocumentationUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ViewTutorial implements Task {
    String navigationItem;

    public ViewTutorial(String navigationItem) {
        this.navigationItem = navigationItem;
    }

    public static Performable with(String navigationItem){
        return Tasks.instrumented(ViewTutorial.class,navigationItem);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DocumentationUI.NAVIGATION_ITEM.of(navigationItem)),
                Browser.waitForPageLoad()
        );
    }
}
