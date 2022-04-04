package io.github.toronto22.question.common.slider;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RangerSlider implements Question<Integer> {
    Target target;
    boolean isStartValue;

    public RangerSlider(Target target, boolean isStartValue) {
        this.target = target;
        this.isStartValue = isStartValue;
    }

    public static Question<Integer> startValue(Target target){
        return new RangerSlider(target,true);
    }
    public static Question<Integer> endValue(Target target){
        return new RangerSlider(target,false);
    }
    @Override
    public Integer answeredBy(Actor actor) {
        By pointer;
        if(isStartValue){
            pointer = By.xpath(".//div[@data-handle='0']/..");
        } else {
            pointer = By.xpath(".//div[@data-handle='1']/..");
        }

        String style = target.resolveFor(actor).findElement(pointer).getAttribute("style");
        int percentage = Integer.parseInt(style.replaceAll("\\D+",""));

        return percentage;
    }
}
