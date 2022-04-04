package io.github.toronto22.question.common.progress_bar;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import org.apache.commons.lang3.tuple.Pair;
import org.openqa.selenium.By;

public class ProgressBar implements Question<Pair<String,String>> {
    Target target;

    public ProgressBar(Target target) {
        this.target = target;
    }

    public static Question<Pair<String,String>> pairValue(Target target){
        return new ProgressBar(target);
    }
    @Override
    public Pair<String, String> answeredBy(Actor actor) {
        By barElement = By.xpath(".//div[@role='progressbar']");
        String currentValue = target.resolveFor(actor).findElement(barElement).getAttribute("aria-valuenow");
        String maxValue = target.resolveFor(actor).findElement(barElement).getAttribute("aria-valuemax");

        Pair<String,String> value = Pair.of(currentValue,maxValue);
        return value;
    }
}
