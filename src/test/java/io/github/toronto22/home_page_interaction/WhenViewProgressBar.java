package io.github.toronto22.home_page_interaction;

import io.github.toronto22.WebHook;
import io.github.toronto22.question.common.progress_bar.ProgressBar;
import io.github.toronto22.ui.HomeUI;
import net.serenitybdd.screenplay.actions.Scroll;
import org.apache.commons.lang3.tuple.Pair;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static net.serenitybdd.screenplay.GivenWhenThen.*;


public class WhenViewProgressBar extends WebHook {
    @Test
    public void should_be_able_to_view_progress_bar(){
        when(kevin).attemptsTo(
                Scroll.to(HomeUI.FIRST_PROGRESS_BAR).andAlignToBottom()
        );

        Pair<String,String> value = Pair.of("25","100");

        then(kevin).should(
               seeThat(ProgressBar.pairValue(HomeUI.FIRST_PROGRESS_BAR), Matchers.equalTo(value))
        );
    }
}
