package pom.tests.LietuvosGelezinkeliai;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.pages.LietuvosGelezinkeliai.TimetablePage;
import pom.tests.TestBase;

public class TimeTableTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        TimetablePage.openUrl("https://bilietas.ltglink.lt/timetable");
    }

    @Test
    public void testInputFullTravelRouteData() {

        String from = "Vilnius";
        String to = "Kaunas";
        String date = "Ket 2022 m. lapkričio 24 d.";

        String expectedResult = "Tvarkarščiai";
        String actualResult;

        TimetablePage.clickButtonFrom();
        TimetablePage.enterStopNameFrom(from);
        TimetablePage.clickButtonTo();
        TimetablePage.enterStopNameTo(to);
        TimetablePage.clickButtonDate();
        TimetablePage.clickButtonTravelDate(date);

        TimetablePage.clickButtonSearch();
        actualResult = TimetablePage.readSearchResults();

        Assert.assertTrue(actualResult.contains(expectedResult),
                String.format("Actual: %s, Expected: %s", actualResult, expectedResult)
        );
    }
}

