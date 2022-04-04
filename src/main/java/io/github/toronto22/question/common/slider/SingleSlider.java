package io.github.toronto22.question.common.slider;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SingleSlider implements Question<Integer> {
    Target target;

    public SingleSlider(Target target) {
        this.target = target;
    }

    public static Question<Integer> value(Target target){
        return new SingleSlider(target);
    }
    @Override
    public Integer answeredBy(Actor actor) {
        By pointer1 = By.xpath(".//div[@data-handle='0']/..");
        String style = target.resolveFor(actor).findElement(pointer1).getAttribute("style");
        int percentage = Integer.parseInt(style.replaceAll("\\D+",""));

        return percentage;
    }
}
