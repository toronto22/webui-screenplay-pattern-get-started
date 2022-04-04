package io.github.toronto22.question.common.toggle_button;

import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ToggleButtonStatus implements Question<Boolean> {
    Target target;

    public ToggleButtonStatus(Target target) {
        this.target = target;
    }

    public static Question<Boolean> isOn(Target target){
        return new ToggleButtonStatus(target);
    }

    @SneakyThrows
    @Override
    public Boolean answeredBy(Actor actor) {
       String classValue =  target.resolveFor(actor).findElement(By.tagName("div")).getAttribute("class");
       if(classValue.contains("bootstrap-switch-on")) return true;
       if(classValue.contains("bootstrap-switch-off")) return false;

       throw new Exception("Cannot detect the status!!!");
    }
}
