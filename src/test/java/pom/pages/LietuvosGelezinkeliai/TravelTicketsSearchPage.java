package pom.pages.Gelezinkelis;

import org.openqa.selenium.TimeoutException;
import pom.pages.Common;
import pom.pages.Locators;



public class TravelTicketsSearchPage {


    public static void openUrl(String url) {
        Common.openUrl(url);
    }

    public static void clickButtonTravelOriginFrom() {
        try {
            Common.waitForElementToBeClickable(Locators.Gelezinkelis.SearchForTickets.buttonKryptisIs);
            Common.clickElement(Locators.Gelezinkelis.SearchForTickets.buttonKryptisIs);
        } catch (TimeoutException exception) {
            exception.printStackTrace();
        }
    }

    public static void enterTravelOriginFrom(String message) {
        Common.senKeysToElement(
                Locators.Gelezinkelis.SearchForTickets.enterKelionesKryptisIs,
                message
        );
    }

    public static void clickButtonTravleDestinationTo() {

        try {
            Common.waitForElementToBeClickable(Locators.Gelezinkelis.SearchForTickets.buttonKryptisI);
            Common.clickElement(Locators.Gelezinkelis.SearchForTickets.buttonKryptisI);
        } catch (TimeoutException exception) {
            exception.printStackTrace();
        }
    }


    public static void enterTravelDestinationTo(String message) {
        Common.senKeysToElement(
                Locators.Gelezinkelis.SearchForTickets.enterKelionesKryptisI,
                message
        );
    }

    public static void clickButtonSearch() {
        Common.clickElement(Locators.Gelezinkelis.KlientoPaskyra.buttonIeskoti);
    }

    public static String readSearchResults() {
        return Common.getTextFromElement(
                Locators.Gelezinkelis.SearchForTickets.searchResults
        );
    }

    public static String readIncorrectDataMessage() {
        return Common.getTextFromElement(
                Locators.Gelezinkelis.SearchForTickets.nePilniDuomenysPaieskosRezultatai
        );
    }
}

