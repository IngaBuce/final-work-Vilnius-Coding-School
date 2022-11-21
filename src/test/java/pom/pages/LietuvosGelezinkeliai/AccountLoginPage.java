package pom.pages.LietuvosGelezinkeliai;

import pom.pages.Common;
import pom.pages.Locators;

public class AccountLoginPage {

    public static void clickButtonConfirm() {
        Common.clickElement(
                Locators.RailRoads.LoginAccount.spanButtonConfirm);
    }

    public static void openUrl(String url) {
        Common.openUrl(url);
    }

    public static void enterUserName(String text) {
        Common.senKeysToElement(
                Locators.RailRoads.LoginAccount.inputUserName,
                text);
    }

    public static void enterPassword(String text) {
        Common.senKeysToElement(
                Locators.RailRoads.LoginAccount.inputPassword,
                text);
    }

    public static String readLoginErrorMessage() {
        return Common.getTextFromElement(
                Locators.RailRoads.LoginAccount.divErrorToastContent);
    }

    public static String readSuccessfulLoginContent() {
        return Common.getTextFromElement(
                Locators.RailRoads.LoginAccount.listMyAccountContent);
    }
}

