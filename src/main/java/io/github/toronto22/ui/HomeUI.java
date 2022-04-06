package io.github.toronto22.ui;

import net.serenitybdd.screenplay.targets.Target;

public class HomeUI {
    public static final Target CLOSE_ADS_BUTTON = Target.the("close ads button")
            .locatedBy("//a[@id='close-bar']");
    //Button
    public static final Target DEFAULT_BUTTON = Target.the("default button")
            .locatedBy("(//button[text()='Default'])[1]");

    //Link
    public static final Target DEFAULT_LINK = Target.the("default link")
            .locatedBy("//a[text()='Default']");

    //Input
    public static final Target DEFAULT_INPUT = Target.the("default input")
            .locatedBy("(//input[@class='form-control'])[1]");
    public static final Target SUCCESS_INPUT = Target.the("success input")
            .locatedBy("//input[@id='inputSuccess1']");
    public static final Target ERROR_INPUT = Target.the("error input")
            .locatedBy("//input[@id='inputDanger1']");

    //Checkbox
    public static final Target UNCHECKED_CHECKBOX = Target.the("unchecked checkbox")
            .locatedBy("//label[text()=' Unchecked ']/input");
    public static final Target CHECKED_CHECKBOX = Target.the("checked checkbox")
            .locatedBy("//label[text()=' Checked ']/input");
    public static final Target DISABLE_UNCHECKED_CHECKBOX = Target.the("disabled unchecked checkbox")
            .locatedBy("//label[text()=' Disabled unchecked ']/input");
    public static final Target DISABLE_CHECKED_CHECKBOX = Target.the("disabled checked checkbox")
            .locatedBy("//label[text()=' Disabled checked ']/input");

    //RADIO
    public static final Target RADIO_IS_OFF_RADIO  = Target.the("radio is off radio")
            .locatedBy("//input[@id='exampleRadios1']");
    public static final Target RADIO_IS_ON_RADIO  = Target.the("radio is on radio")
            .locatedBy("//input[@id='exampleRadios2']");
    public static final Target DISABLED_RADIO_IS_OFF_RADIO  = Target
            .the("disabled radio is off radio")
            .locatedBy("//input[@id='exampleRadios3']");
    public static final Target DISABLED_RADIO_IS_ON_RADIO  = Target
            .the("disabled radio is on radio")
            .locatedBy("//input[@id='exampleRadios4']");

    //Toggle button
    public static final Target OFF_TOGGLE_BUTTON = Target.the("off toggle button")
            .locatedBy("//bswitch[1]/div");
    public static final Target ON_TOGGLE_BUTTON = Target.the("on toggle button")
            .locatedBy("//bswitch[2]/div");

    //Slider
    public static final Target POINT_SLIDER = Target.the("point slider")
            .locatedBy("//div[@class='noUi-target noUi-ltr noUi-horizontal']");
    public static final Target RANGE_SLIDER = Target.the("point slider")
            .locatedBy("//nouislider[2]");

    //Menu
    public static final Target MENU_MENU = Target.the("menu menu")
            .locatedBy("//a[text()='Menu']");
    public static final Target LINK_MENU = Target.the("link menu")
            .locatedBy("//a[text()='Link']");
    public static final Target DROPDOWN_MENU = Target.the("dropdown menu")
            .locatedBy("//a[@id='dropdownBasic1']");
    public static final Target ANOTHER_ACTION_SUBMENU = Target.the("another action submenu")
            .locatedBy("//a[@id='dropdownBasic1']");

    //Navigation
    public static final Target DISCOVER_NAVIGATION = Target.the("discover navigation")
            .locatedBy("(//a[contains(text(),'Discover')])[1]");

    //Progress bar
    public static final Target FIRST_PROGRESS_BAR = Target.the("first progress bar")
            .locatedBy("//ngb-progressbar[1]");

    //Pagination
    public static final Target SECOND_PAGINATION = Target.the("second pagination")
            .locatedBy("//ngb-pagination[2]");

    //Navigation tabs
    public static final Target HOME_TAB = Target.the("home tab")
            .locatedBy("//a[@id='ngb-tab-0']/..");
    public static final Target PROFILE_TAB = Target.the("profile tab")
            .locatedBy("//a[@id='ngb-tab-1']/..");
    public static final Target MESSAGES_TAB = Target.the("profile tab")
            .locatedBy("//a[@id='ngb-tab-2']/..");
    //Label
    public static final Target LABEL = Target.the("Label {0}")
            .locatedBy("//span[contains(@class,'label ')][text()='{0}']");

    //Notification
    public static final Target SUCCESS_NOTIFICATION = Target.the("success notification")
            .locatedBy("//ngb-alert[@class='alert alert-success']");

    //Typography
    public static final Target HEADER_1 = Target.the("header 1")
            .locatedBy("//span[text()='Header 1']/..");
    public static final Target HEADER_2 = Target.the("header 2")
            .locatedBy("//span[text()='Header 2']/..");
    public static final Target HEADER_3 = Target.the("header 3")
            .locatedBy("//span[text()='Header 3']/..");
    public static final Target HEADER_4 = Target.the("header 4")
            .locatedBy("//span[text()='Header 4']/..");
    public static final Target HEADER_5 = Target.the("header 5")
            .locatedBy("//span[text()='Header 5']/..");
    public static final Target HEADER_6 = Target.the("header 6")
            .locatedBy("//span[text()='Header 6']/..");
    public static final Target PARAGRAPH = Target.the("paragraph")
            .locatedBy("//span[text()='Paragraph']/..");
    public static final Target QUOTE = Target.the("quote")
            .locatedBy("//span[text()='Quote']/..");
    public static final Target MUTED_TEXT = Target.the("muted text")
            .locatedBy("//span[text()='Muted Text']/..");
    public static final Target PRIMARY_TEXT = Target.the("primary text")
            .locatedBy("//span[text()='Primary Text']/..");

    //Image
    public static final Target CIRCLE_IMAGE = Target.the("circle image")
            .locatedBy("//h4[text()='Circle Image']/following-sibling::img");

    //Modal
    public static final Target LAUNCH_DEMO_MODAL_BUTTON = Target.the("launch demo modal button")
            .locatedBy("//button[text()='Launch demo modal']");
    public static final Target MODAL_CLOSE_ICON = Target.the("modal close icon")
            .locatedBy("//button[@aria-label='Close']");
    public static final Target MODAL_TITLE = Target.the("modal title")
            .locatedBy("//div[@class='modal-header']/h5");
    public static final Target MODAL_BODY = Target.the("modal body")
            .locatedBy("//div[@class='modal-body']");
    public static final Target MODAL_NEVER_MIND_BUTTON = Target.the("modal never mind button")
            .locatedBy("//button[text()='Never mind']");
    public static final Target MODAL_DELETE_BUTTON = Target.the("modal delete button")
            .locatedBy("//button[text()='DELETE']");

    //Date picker
    public static final Target DATE_PICKER = Target.the("date picker")
            .locatedBy("//input[@name='dp']");

    //Popover
    public static final Target ON_RIGHT_BUTTON = Target.the("on right button")
            .locatedBy("(//button[text()=' on right '])[1]");
    public static final Target ON_RIGHT_BUTTON_POPOVER = Target.the("on right button popover")
            .locatedBy("//*[@id='ngb-popover-0']");

    //Popover
    public static final Target ON_LEFT_BUTTON = Target.the("on right button")
            .locatedBy("(//button[text()=' on left '])[2]");
    public static final Target ON_LEFT_BUTTON_TOOLTIP = Target.the("on right button tooltop")
            .locatedBy("//ngb-tooltip-window[@id='ngb-tooltip-0']");

    //Carousel
    public static final Target CAROUSEL = Target.the("carousel")
            .locatedBy("//ngb-carousel");

    //Other
    public static final Target DOCUMENTATION_BUTTON = Target.the("documentation button")
            .locatedBy("//a[text()=' Documentation']/..");
}
