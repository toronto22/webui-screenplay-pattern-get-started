package io.github.toronto22.ui;

import net.serenitybdd.screenplay.targets.Target;

public class DocumentationUI {
    public static final Target TITLE_LABEL = Target.the("title label")
            .locatedBy("//div[@class='motto']/h2");
    public static final Target NAVIGATION_ITEM = Target.the("navigation item of {0}")
            .locatedBy("//a[text()='{0}']/..");

    //Tutorial content
    public static final Target TUTORIAL_TITLE_LABEL = Target.the("tutorial title label")
            .locatedBy("//div[@class='row tim-row']//h2");
}
