package pom.pages.Gelezinkelis;
import pom.pages.Common;
import pom.pages.Locators;

public class AccountLoginPage {

    public static void clickButtonPatvirtinti (){
        Common.clickElement(Locators.Gelezinkelis.KlientoPaskyra.buttonPatvirtinti);
    };

    public static void openUrl(String url) {
        Common.openUrl(url);
    }

    public static void sleep(int millis) {
        Common.sleep(millis);
    }

    public static void close() {
        Common.close();
    }

    public static void enterVartotojasVardas(String message) {
        Common.senKeysToElement(
                Locators.Gelezinkelis.KlientoPaskyra.inputVartotojoVardas,
                message
        );
    }
    public static void enterSlaptazodis(String message){
        Common.senKeysToElement(
                Locators.Gelezinkelis.KlientoPaskyra.inputSlaptazodis,
                message
        );
    }

    public static String readPaskyraMessage() {
        return Common.getTextFromElement(
                Locators.Gelezinkelis.KlientoPaskyra.paragraphPaskyraContent);
    }

    public static String readSekmingoPrisijungimoMessage() {
        return Common.getTextFromElement(
                Locators.Gelezinkelis.KlientoPaskyra.paragraphMyAccountContent
        );
    }
}

