package io.github.toronto22.interaction.web_element.slider;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SingleSlider implements Interaction {
    int value;
    Target target;

    public SingleSlider(int value, Target target) {
        this.value = value;
        this.target = target;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebElement element = target.resolveFor(actor).findElement(By.xpath(".//div[contains(@class,'noUi-handle')]"));
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        int sliderWidth = target.resolveFor(actor).getSize().getWidth();
        int point = sliderWidth * value/100;

        //Move to 0%
        new Actions(driver).dragAndDropBy(element, -sliderWidth,0).build().perform();

        new Actions(driver).dragAndDropBy(element, point,0).build().perform();
    }

}
