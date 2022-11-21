package pom.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        takeScreenshot("failure");
    }

    private void takeScreenshot(String status) {

        try {
            TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();
            File screenshotRaw = takesScreenshot.getScreenshotAs(OutputType.FILE);

            LocalDateTime localDateTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH_mm_ss_SSS");
            String dateAndTime = localDateTime.format(formatter);

            String directory = "./screenshots/";
            String fileName = status + "_screenshot_" + dateAndTime + "_" + UUID.randomUUID() + ".png";

            File screenshotFile = new File(directory + fileName);

            FileUtils.copyFile(screenshotRaw, screenshotFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
