package io.github.toronto22.question.common.input;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class InputPlaceHolder implements Question<String> {
    Target target;

    public InputPlaceHolder(Target target) {
        this.target = target;
    }
    public static Question<String> value(Target target){
        return new InputPlaceHolder(target);
    }
    @Override
    public String answeredBy(Actor actor) {
       return target.resolveFor(actor).getAttribute("placeholder");
    }
}
