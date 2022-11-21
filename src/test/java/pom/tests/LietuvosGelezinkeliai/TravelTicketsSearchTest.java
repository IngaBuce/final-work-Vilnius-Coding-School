package pom.tests.gelezinkelis;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pom.pages.Gelezinkelis.TravelTicketsSearchPage;
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

        TravelTicketsSearchPage.clickButtonTravelOriginFrom();
        TravelTicketsSearchPage.enterTravelOriginFrom(originFrom);
        TravelTicketsSearchPage.clickButtonTravleDestinationTo();
        TravelTicketsSearchPage.enterTravelDestinationTo(destinationTo);

        TravelTicketsSearchPage.clickButtonSearch();
        actualResult = TravelTicketsSearchPage.readSearchResults();

        Assert.assertTrue(actualResult.contains(expectedResult),
                String.format("Actual: %s, Expected: %s", actualResult, expectedResult)
        );
    }

    @DataProvider(name = "testInputInCorrectTravelStopNames")
    public Object[][] InCorrectTravelStopNamesFunction() {
        return new Object[][]{
                {"Vilnius", "Saltupiskes"}
        };
    }

    @Test(dataProvider = "testInputInCorrectTravelStopNames")
    public void testInputInCorrectTravelStopNames(String originFrom, String destinationTo) {

        String expectedResult = "Patikrinkite ar teisingai įvedėte stotelės pavadinimą";
        String actualResult;

        TravelTicketsSearchPage.clickButtonTravelOriginFrom();
        TravelTicketsSearchPage.enterTravelOriginFrom(originFrom);
        TravelTicketsSearchPage.clickButtonTravleDestinationTo();
        TravelTicketsSearchPage.enterTravelDestinationTo(destinationTo);

        TravelTicketsSearchPage.clickButtonSearch();
        actualResult = TravelTicketsSearchPage.readIncorrectDataMessage();

        Assert.assertTrue(actualResult.contains(expectedResult),
                String.format("Actual: %s, Expected: %s", actualResult, expectedResult)
        );
    }
}
