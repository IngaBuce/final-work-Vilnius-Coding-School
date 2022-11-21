package pom.pages.LietuvosGelezinkeliai;

import org.openqa.selenium.TimeoutException;
import pom.pages.Common;
import pom.pages.Locators;

public class TravelTicketsSearchPage {

    public static void openUrl(String url) {
        Common.openUrl(url);
    }

    public static void clickButtonFrom() {
        try {
            Common.waitForElementToBeClickable(Locators.RailRoads.SearchForTickets.inputFieldOriginFrom);
            Common.clickElement(Locators.RailRoads.SearchForTickets.inputFieldOriginFrom);
        } catch (TimeoutException exception) {
            exception.printStackTrace();
        }
    }

    public static void enterTravelOriginFrom(String message) {
        Common.senKeysToElement(
                Locators.RailRoads.SearchForTickets.inputOriginFrom,
                message);
    }

    public static void clickButtonTo() {
        try {
            Common.waitForElementToBeClickable(Locators.RailRoads.SearchForTickets.inputFieldDestinationTo);
            Common.clickElement(Locators.RailRoads.SearchForTickets.inputFieldDestinationTo);
        } catch (TimeoutException exception) {
            exception.printStackTrace();
        }
    }

    public static void enterTravelDestinationTo(String message) {
        Common.senKeysToElement(
                Locators.RailRoads.SearchForTickets.inputDestinationTo,
                message);
    }

    public static void clickButtonSearch() {
        Common.clickElement(
                Locators.RailRoads.LoginAccount.buttonSearch);
    }

    public static String readSearchResults() {
        return Common.getTextFromElement(
                Locators.RailRoads.SearchForTickets.divSearchResults);
    }

    public static String readIncorrectDataMessage() {
        return Common.getTextFromElement(
                Locators.RailRoads.SearchForTickets.divToastErrorContent);
    }
}

