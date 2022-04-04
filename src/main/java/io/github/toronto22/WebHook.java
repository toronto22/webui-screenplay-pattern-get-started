package io.github.toronto22;

import io.cucumber.java.BeforeAll;
import io.github.toronto22.task.home.CloseAdsPopup;
import net.serenitybdd.junit5.SerenityTest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;
import static net.serenitybdd.screenplay.GivenWhenThen.when;

@SerenityTest
public class WebHook {
    @Managed
    WebDriver driver;
    Actor kevin = Actor.named("kevin");

    @BeforeEach
    public void setup(){
        givenThat(kevin).can(
                BrowseTheWeb.with(driver)
        );
        when(kevin).attemptsTo(
                Open.url(WebUrl.HOME_PAGE),
                CloseAdsPopup.perform()
        );
    }
}
