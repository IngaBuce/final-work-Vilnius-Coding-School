package pom.tests.LietuvosGelezinkeliai;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pom.pages.LietuvosGelezinkeliai.TravelTicketsSearchPage;
import pom.tests.TestBase;

public class TravelTicketsSearchTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        TravelTicketsSearchPage.openUrl("https://ltglink.lt/");
    }

    @DataProvider(name = "testInputCorrectTravelStopNames")
    public Object[][] travelStopNameDataFunction() {
        return new Object[][]{
                {"Vilnius", "Kaunas"}
        };
    }

    @Test(dataProvider = "testInputCorrectTravelStopNames")
    public void testInputCorrectTravelStopNames(String originFrom, String destinationTo) {

        String expectedResult = "Paieškos rezultatai";
        String actualResult;

        TravelTicketsSearchPage.clickButtonFrom();
        TravelTicketsSearchPage.enterTravelOriginFrom(originFrom);
        TravelTicketsSearchPage.clickButtonTo();
        TravelTicketsSearchPage.enterTravelDestinationTo(destinationTo);

        TravelTicketsSearchPage.clickButtonSearch();
        actualResult = TravelTicketsSearchPage.readSearchResults();

        Assert.assertTrue(actualResult.contains(expectedResult),
                String.format("Actual: %s, Expected: %s", actualResult, expectedResult)
        );
    }

    @DataProvider(name = "incorrectTravelStopNames")
    public Object[][] incorrectTravelStopNamesFunction() {
        return new Object[][]{
                {"Vilnius", "Saltupiskes"}
        };
    }

    @Test(dataProvider = "incorrectTravelStopNames")
    public void testInputIncorrectTravelStopNames(String originFrom, String destinationTo) {

        String expectedResult = "Patikrinkite ar teisingai įvedėte stotelės pavadinimą";
        String actualResult;

        TravelTicketsSearchPage.clickButtonFrom();
        TravelTicketsSearchPage.enterTravelOriginFrom(originFrom);
        TravelTicketsSearchPage.clickButtonTo();
        TravelTicketsSearchPage.enterTravelDestinationTo(destinationTo);

        TravelTicketsSearchPage.clickButtonSearch();
        actualResult = TravelTicketsSearchPage.readIncorrectDataMessage();

        Assert.assertTrue(actualResult.contains(expectedResult),
                String.format("Actual: %s, Expected: %s", actualResult, expectedResult)
        );
    }
}
