package io.github.toronto22.interaction.web_element.pagination;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Pagination implements Interaction {
    int pageNumber;
    Target target;

    public Pagination(Target target,int pageNumber) {
        this.pageNumber = pageNumber;
        this.target = target;
    }

    public static Performable switchToPage(Target target,int pageNumber){
        return Tasks.instrumented(Pagination.class,target, pageNumber);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        int currentPage = Integer.parseInt(target.resolveFor(actor)
                .findElement(By.xpath(".//li[@class='page-item active']/a"))
                .getText().replaceAll("\\D+",""));

        Target nextPageButton = Target.the("next page button").locatedBy(
                ".//a[@aria-label='Next']/.."
        );

        Target previousPageButton = Target.the("previous page button").locatedBy(
                ".//a[@aria-label='Previous']/.."
        );
        int diff = pageNumber - currentPage;
        if(diff>0){
            for (int i=0;i<diff;i++){
                actor.attemptsTo(
                        Click.on(nextPageButton)
                );
            }
        } else {
            diff = -diff;
            for (int i=0;i<diff;i++){
                actor.attemptsTo(
                        Click.on(previousPageButton)
                );
            }
        }
    }
}
