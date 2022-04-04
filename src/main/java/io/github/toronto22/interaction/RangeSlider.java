package io.github.toronto22.interaction;

import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RangeSlider implements Interaction {
    int value;
    int value2;
    Target target;

    public RangeSlider(int value,int value2, Target target) {
        this.value = value;
        this.value2 = value2;
        this.target = target;
    }

    @SneakyThrows
    @Override
    public <T extends Actor> void performAs(T actor) {
        if(value > value2) {
            throw new Exception("Invalid range value with value2 < value1");
        }

        WebElement pointer1 = target.resolveFor(actor).findElement(By.xpath(".//div[@data-handle='0']"));
        WebElement pointer2 = target.resolveFor(actor).findElement(By.xpath(".//div[@data-handle='1']"));

        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        int sliderWidth = target.resolveFor(actor).getSize().getWidth();

        int point1 = sliderWidth * value/100;
        int point2 = sliderWidth * value2/100;

        //Move to 0%
        new Actions(driver).dragAndDropBy(pointer1, -sliderWidth,0).build().perform();
        new Actions(driver).dragAndDropBy(pointer2, -sliderWidth,0).build().perform();

        new Actions(driver).dragAndDropBy(pointer2, point2,0).build().perform();
        new Actions(driver).dragAndDropBy(pointer1, point1,0).build().perform();
    }

}
