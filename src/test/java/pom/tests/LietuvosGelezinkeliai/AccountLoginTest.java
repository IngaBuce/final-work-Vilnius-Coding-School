package pom.tests.LietuvosGelezinkeliai;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pom.pages.LietuvosGelezinkeliai.AccountLoginPage;
import pom.pages.LietuvosGelezinkeliai.HomePage;
import pom.tests.TestBase;

public class AccountLoginTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        AccountLoginPage.openUrl("https://ltglink.lt/");
        HomePage.clickMyAccountLabel();
    }

    @DataProvider(name = "correctLoginData")
    public Object[][] correctLoginDataFunction() {
        return new Object[][]{
                {"saltukas@gmail.com", "Baltukas11+"}
        };
    }

    @Test(dataProvider = "correctLoginData")
    public void testInputCorrectLoginData(String user, String password) {

        String expectedResult = "Bilietai";
        String actualResult;

        AccountLoginPage.enterUserName(user);
        AccountLoginPage.enterPassword(password);
        AccountLoginPage.clickButtonConfirm();
        actualResult = AccountLoginPage.readSuccessfulLoginContent();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @DataProvider(name = "incorrectLoginData")
    public Object[][] incorrectLoginDataFunction() {
        return new Object[][]{
                {"saltukas@gmail.com", "baltukas"}
        };
    }

    @Test(dataProvider = "incorrectLoginData")
    public void testInputIncorrectLoginData(String user, String password) {

        String expectedResult = "Neteisingi prisijungimo duomenys";
        String actualResult;

        AccountLoginPage.enterUserName(user);
        AccountLoginPage.enterPassword(password);
        AccountLoginPage.clickButtonConfirm();
        actualResult = AccountLoginPage.readLoginErrorMessage();

        Assert.assertEquals(actualResult, expectedResult);
    }
}


