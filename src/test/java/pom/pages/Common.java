package pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pom.utils.Driver;

import java.time.Duration;

public class Common {

    public static void openUrl(String url) {Driver.setDriver();Driver.getDriver().get(url);}

    public static void close() {Driver.close();}

    private static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }

    public static void senKeysToElement(By locator, String keys) {
        getElement(locator).sendKeys(keys);
    }

    public static void clickElement(By locator) {
        getElement(locator).click();
    }

    public static String getTextFromElement(By locator) {
        return getElement(locator).getText();
    }

    public static void waitForElementToBeClickable(By locator) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static void clickElementByAction(By locator) {
        WebElement element = getElement(locator);

        Actions actions = new Actions(Driver.getDriver());
        actions.doubleClick(element).perform();
    }
}



