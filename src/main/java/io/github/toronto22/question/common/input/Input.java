package io.github.toronto22.question.common.input;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class Input {
    Target target;

    public Input(Target target) {
        this.target = target;
    }

    public static Input of(Target target){
        return new Input(target);
    }

    public Question<String> placeHolderText(){
        return new InputPlaceHolder(target);
    }
    public Question<String> value(){
        return new InputValue(target);
    }
    public Question<String> errorMessage(){
        return new InputErrorMessage(target);
    }

}
