package io.github.toronto22.interaction.browser;

import io.github.toronto22.interaction.browser.action.JsClick;
import io.github.toronto22.interaction.browser.wait.WaitForPageLoad;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;

public class Browser {
    public static Performable jsClick(Target target){
        return JsClick.on(target);
    }
    public static Performable waitForPageLoad(){
        return WaitForPageLoad.perform();
    }
}
