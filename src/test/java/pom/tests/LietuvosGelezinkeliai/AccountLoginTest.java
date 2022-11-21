package pom.tests.gelezinkelis;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pom.pages.Gelezinkelis.AccountLoginPage;
import pom.tests.TestBase;

public class AccountLoginTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        AccountLoginPage.openUrl("https://bilietas.ltglink.lt/account/login");
    }

    @DataProvider(name = "neteisingiPrisijungimoDuomenys")
    public Object[][] neteisingiPrisijungimoDuomenysFunction() {
        return new Object[][]{
                {"saltukas@gmail.com", "baltukas"}
        };
    }

    @Test(dataProvider = "neteisingiPrisijungimoDuomenys")
    public void testInputNeteisingiPrisijungimoDuomenys(String vartotojas, String slaptazodis) {

        String expectedResult = "Neteisingi prisijungimo duomenys";
        String actualResult;

        AccountLoginPage.enterVartotojasVardas(vartotojas);
        AccountLoginPage.enterSlaptazodis(slaptazodis);
        AccountLoginPage.clickButtonPatvirtinti();
        actualResult = AccountLoginPage.readPaskyraMessage();

        Assert.assertEquals(actualResult, expectedResult);
    }


    @DataProvider(name = "teisingiPrisijungimoDuomenys")
    public Object[][] teisingiPrisijungimoDuomenysFunction() {
        return new Object[][]{
                {"saltukas@gmail.com", "Baltukas11+"}
        };
    }

    @Test(dataProvider = "teisingiPrisijungimoDuomenys")
    public void testInputTeisingiPrisijungimoDuomenys(String vartotojas, String slaptazodis) {

        String expectedResult = "Bilietai";
        String actualResult;

        AccountLoginPage.enterVartotojasVardas(vartotojas);
        AccountLoginPage.enterSlaptazodis(slaptazodis);
        AccountLoginPage.clickButtonPatvirtinti();
        actualResult = AccountLoginPage.readSekmingoPrisijungimoMessage();

        Assert.assertEquals(actualResult, expectedResult);

    }
}


