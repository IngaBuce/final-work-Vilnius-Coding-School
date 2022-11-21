package pom.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Driver {

    private static ThreadLocal<WebDriver> threads = new ThreadLocal<>();

    public static WebDriver getDriver() {
        return threads.get();
    }

    public static void setDriver() {
        WebDriverManager.chromedriver().setup();
        threads.set(new ChromeDriver(getOptions()));
        threads.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }

    private static ChromeOptions getOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=2000,3000");
        options.addArguments("--force-device-scale-factor=0.85");
        options.addArguments("--incognito");
        return options;
    }

    public static void close() {
        threads.get().quit();
        threads.remove();
    }
 }



