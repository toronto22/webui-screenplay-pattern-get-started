package io.github.toronto22.home_page_interaction;

import io.github.toronto22.WebHook;
import io.github.toronto22.interaction.web_element.slider.Slide;
import io.github.toronto22.question.common.slider.RangerSlider;
import io.github.toronto22.question.common.slider.SingleSlider;
import io.github.toronto22.ui.HomeUI;
import net.serenitybdd.screenplay.actions.Scroll;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static net.serenitybdd.screenplay.GivenWhenThen.*;

public class WhenInteractWithSlider extends WebHook {
    @Test
    public void should_be_able_change_value_of_single_slider(){
        int percentageValue = 10;
        when(kevin).attemptsTo(
                Scroll.to(HomeUI.POINT_SLIDER).andAlignToBottom(),
                Slide.byPercentage(percentageValue).intoSingleSlider(HomeUI.POINT_SLIDER)
        );
        then(kevin).should(
                seeThat(SingleSlider.value(HomeUI.POINT_SLIDER), Matchers.equalTo(percentageValue))
        );
    }

    @Test
    public void should_be_able_change_value_of_range_slider(){
        int startValue = 13;
        int endValue = 69;
        when(kevin).attemptsTo(
                Scroll.to(HomeUI.RANGE_SLIDER).andAlignToBottom(),
                Slide.byPercentage(startValue,endValue).intoRangeSlider(HomeUI.RANGE_SLIDER)
        );

        then(kevin).should(
                seeThat(RangerSlider.startValue(HomeUI.RANGE_SLIDER), Matchers.equalTo(startValue)),
                seeThat(RangerSlider.endValue(HomeUI.RANGE_SLIDER), Matchers.equalTo(endValue))
        );
    }
}
