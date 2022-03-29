package io.github.toronto22.question.common.input;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class InputValue implements Question<String> {
    Target target;

    public InputValue(Target target) {
        this.target = target;
    }
    public static Question<String> get(Target target){
        return new InputValue(target);
    }
    @Override
    public String answeredBy(Actor actor) {
       return target.resolveFor(actor).getAttribute("value");
    }
}
