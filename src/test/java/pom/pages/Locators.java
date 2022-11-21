package pom.pages;

import org.openqa.selenium.By;

public class Locators {

    public static class RailRoads {

        public static class Home {

            public static By buttonMyAccount = By.xpath(
                    "//button[@class='shared-icon-button ']");
        }

        public static class SearchForTickets {

            public static By inputOriginFrom = By.xpath(
                    "//input[@aria-activedescendant='stop-search-select-option-ticket-origin-0']");
            public static By inputDestinationTo = By.xpath(
                    "//input[@aria-labelledby='stop-search-select-label-ticket-destination']");
            public static By divSearchResults = By.xpath(
                    "//div[@class='title-buttons-wrapper']");
            public static By inputFieldOriginFrom = By.xpath(
                    "//input[@list='ticket-origin-search-datalist']");
            public static By inputFieldDestinationTo = By.xpath(
                    "//input[@list='ticket-destination-search-datalist']");
            public static By divToastErrorContent = By.xpath(
                    "//div[@class='shared-toast-wrapper toast--anim-enter-done']");
        }

        public class LoginAccount {

            public static By inputUserName = By.xpath(
                    "//input[@name='username']");
            public static By inputPassword = By.xpath(
                    "//input[@name='password']");
            public static By spanButtonConfirm = By.xpath(
                    "//span[@class='btn-children']");
            public static By divErrorToastContent = By.xpath(
                    "//div[@class='shared-toast-wrapper toast--anim-enter-done'] ");
            public static By listMyAccountContent = By.xpath(
                    "//li[@class='single-menu-item active']");
            public static By buttonSearch = By.xpath(
                    "//button[@class='sc-gb70f5-0 ldiCwA sc-2p7noq-0 ccKUSH no-hc base']");
        }

        public static class TimeTable {

            public static By inputButtomFrom = By.xpath(
                    "//input[@list='origin-search-datalist']");
            public static By inputButtondTo = By.xpath(
                    "//input[@list='destination-search-datalist']");
            public static By enterInputFrom = By.xpath(
                    "//input[@aria-activedescendant='stop-search-select-option-origin-0']");
            public static By enterInputTo = By.xpath(
                    "//input[@aria-activedescendant='stop-search-select-option-destination-0']");
            public static By divButtonDate = By.xpath(
                    "//div[@class='sc-4eytme-1 ghpAfo']");
            public static By spanButtonSearch = By.xpath(
                    "//span[@class='sc-2p7noq-1 kZGVPF']");
            public static By divSearchResult = By.xpath(
                    "//div[@class='timetable-wrapper']");
            public static By divOptionDayOfMonth(String date) {
                return By.xpath(
                        String.format("//div[@aria-label='%s' ]", date)
                );
            }
        }
    }
}






