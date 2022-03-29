package io.github.toronto22.question.common.input;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InputErrorMessage implements Question<String> {
    Target target;

    public InputErrorMessage(Target target) {
        this.target = target;
    }
    public static Question<String> get(Target target){
        return new InputErrorMessage(target);
    }
    @Override
    public String answeredBy(Actor actor) {
        By errorMessage =  By.xpath("./following-sibling::div");
       return target.resolveFor(actor).findElement(errorMessage).getText();
    }
}
