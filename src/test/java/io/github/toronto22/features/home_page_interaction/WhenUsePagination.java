package io.github.toronto22.features.home_page_interaction;

import io.github.toronto22.WebHook;
import io.github.toronto22.interaction.web_element.pagination.Pagination;
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
