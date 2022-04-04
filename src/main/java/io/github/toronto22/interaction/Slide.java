package io.github.toronto22.interaction;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;

public class Slide {
    int value;
    int value2;

    public Slide(int value) {
        this.value = value;
    }
    public Slide(int value, int value2) {
        this.value = value;
        this.value2 = value2;
    }

    public static Slide byPercentage(int value){
        return new Slide(value);
    }
    public static Slide byPercentage(int value,int value2){
        return new Slide(value,value2);
    }

    public Performable intoSingleSlider(Target target){
        return Tasks.instrumented(SingleSlider.class,value,target);
    }

    public Performable intoRangeSlider(Target target){
        return Tasks.instrumented(RangeSlider.class,value,value2,target);
    }
}
