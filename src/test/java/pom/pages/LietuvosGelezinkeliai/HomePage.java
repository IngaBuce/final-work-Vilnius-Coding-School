package pom.pages.LietuvosGelezinkeliai;

import pom.pages.Common;
import pom.pages.Locators;

public class HomePage {

    public static void clickMyAccountLabel() {
        Common.clickElementByAction(Locators.RailRoads.Home.buttonMyAccount);
    }
}
