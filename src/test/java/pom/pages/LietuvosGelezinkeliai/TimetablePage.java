package pom.pages.LietuvosGelezinkeliai;

import org.openqa.selenium.TimeoutException;
import pom.pages.Common;
import pom.pages.Locators;

public class TimetablePage {

    public static void openUrl(String url) {
        Common.openUrl(url);
    }

    public static void clickButtonFrom() {
        try {
            Common.waitForElementToBeClickable(Locators.RailRoads.TimeTable.inputButtomFrom);
            Common.clickElement(Locators.RailRoads.TimeTable.inputButtomFrom);
        } catch (TimeoutException exception) {
            exception.printStackTrace();
        }
    }

    public static void clickButtonTo() {
        try {
            Common.waitForElementToBeClickable(Locators.RailRoads.TimeTable.inputButtondTo);
            Common.clickElement(Locators.RailRoads.TimeTable.inputButtondTo);
        } catch (TimeoutException exception) {
            exception.printStackTrace();
        }
    }

    public static void clickButtonTravelDate(String date) {
        try {
            Common.waitForElementToBeClickable(Locators.RailRoads.TimeTable.divOptionDayOfMonth(date));
            Common.clickElement(Locators.RailRoads.TimeTable.divOptionDayOfMonth(date));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static void enterStopNameFrom(String message) {
        Common.senKeysToElement(
                Locators.RailRoads.TimeTable.enterInputFrom,
                message);
    }

    public static void enterStopNameTo(String message) {
        Common.senKeysToElement(
                Locators.RailRoads.TimeTable.enterInputTo,
                message);
    }

    public static void clickButtonDate() {
        Common.clickElement(
                Locators.RailRoads.TimeTable.divButtonDate);
    }

    public static void clickButtonSearch() {
        Common.clickElement(
                Locators.RailRoads.TimeTable.spanButtonSearch);
    }

    public static String readSearchResults() {
        return Common.getTextFromElement(
                Locators.RailRoads.TimeTable.divSearchResult);
    }
}



