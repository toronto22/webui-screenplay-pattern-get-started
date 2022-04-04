package io.github.toronto22;

import io.github.toronto22.interaction.Pagination;
import io.github.toronto22.task.home.CloseAdsPopup;
import io.github.toronto22.ui.HomeUI;
import net.serenitybdd.screenplay.actions.Scroll;
import org.junit.jupiter.api.Test;

import static net.serenitybdd.screenplay.GivenWhenThen.when;

public class WhenUsePagination extends WebHook {
    @Test
    public void should_be_able_change_page(){
        int pageNumber = 7;
        when(kevin).attemptsTo(
                Scroll.to(HomeUI.SECOND_PAGINATION).andAlignToBottom(),
                Pagination.switchToPage(HomeUI.SECOND_PAGINATION,pageNumber)
        );
    }
}
