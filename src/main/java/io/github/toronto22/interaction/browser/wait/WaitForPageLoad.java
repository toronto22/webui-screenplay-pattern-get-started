package io.github.toronto22.interaction.browser.wait;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForPageLoad implements Task {
    int timeoutInSecond;

    public WaitForPageLoad(int timeoutInSecond) {
        this.timeoutInSecond = timeoutInSecond;
    }

    public static Performable perform(){
        return Tasks.instrumented(WaitForPageLoad.class,30);
    }
    public static Performable perform(int timeoutInSecond){
        return Tasks.instrumented(WaitForPageLoad.class, timeoutInSecond);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        Wait<WebDriver> wait = new WebDriverWait(driver, timeoutInSecond);
        wait.until(driver1 -> {
            System.out.println("Current Window State       : "
                    + ((JavascriptExecutor) driver1).executeScript("return document.readyState"));
            return String
                    .valueOf(((JavascriptExecutor) driver1).executeScript("return document.readyState"))
                    .equals("complete");
        });
    }
}
