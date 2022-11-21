package pom.pages.Gelezinkelis;

import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import pom.pages.Common;
import pom.pages.Locators;


public class TimetablePage {

    public static void openUrl(String url) {
        Common.openUrl(url);
    }

    public static void clickButtonFrom() {
        try {
            Common.waitForElementToBeClickable(Locators.Gelezinkelis.TimeTable.buttonFrom);
            Common.clickElement(Locators.Gelezinkelis.TimeTable.buttonFrom);
        } catch (TimeoutException exception) {
            exception.printStackTrace();
        }
    }

    public static void clickButtonTo() {
        try {
            Common.waitForElementToBeClickable(Locators.Gelezinkelis.TimeTable.buttonTo);
            Common.clickElement(Locators.Gelezinkelis.TimeTable.buttonTo);
        } catch (TimeoutException exception) {
            exception.printStackTrace();
        }
    }

//    public static void clickTravelDate(String date) {
//        try {
//            Common.waitForElementToBeClickable(Locators.Gelezinkelis.TimeTable.optionDayOfMonth);
//            Common.findElement(Locators.Gelezinkelis.TimeTable.optionDayOfMonth);
//            Common.senKeysToElement(Locators.Gelezinkelis.TimeTable.optionDayOfMonth,
//                    date
//
//            );
//        } catch (Exception exception) {
//            exception.printStackTrace();
//        }
//
//    }


    public static void clickTravelDate(String date) {
        try {

            Common.waitForElementToBeClickable(Locators.Gelezinkelis.TimeTable.optionDayOfMonth(date));
            Common.clickElement(Locators.Gelezinkelis.TimeTable.optionDayOfMonth(date));
//            Common.senKeysToElement(Locators.Gelezinkelis.TimeTable.optionDayOfMonth,
//                    date

//            );
        } catch (Exception exception) {
            exception.printStackTrace();
        }

    }


    public static void enterStopNameFrom(String message) {
        Common.senKeysToElement(
                Locators.Gelezinkelis.TimeTable.enterFrom,
                message
        );
    }

    public static void enterStopNameTo(String message) {
        Common.senKeysToElement(
                Locators.Gelezinkelis.TimeTable.enterTo,
                message
        );
    }

    public static void clickButtonDate() {
        Common.clickElement(Locators.Gelezinkelis.TimeTable.buttonDate);
    }

    public static void clickButtonSearch() {
        Common.clickElement(Locators.Gelezinkelis.TimeTable.buttonSearch);
    }

    public static String readSearchResults() {
        return Common.getTextFromElement(Locators.Gelezinkelis.TimeTable.readSearchResult);
    }

    public static void clickOptionDayOfMonth(String date) {
        Common.clickElementWithException(
                Locators.Gelezinkelis.TimeTable.optionDayOfMonth(date)
        );
    }
}

