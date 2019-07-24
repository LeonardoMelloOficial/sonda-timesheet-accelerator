package br.com.sondait.timesheet.config;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumHelper {

    private WebDriver driver;

    public SeleniumHelper() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200", "--ignore-certificate-errors",
                "--silent");
        this.driver = new ChromeDriver(options);

    }

    static {
        String chromeDriverPath = System.getProperty("webdriver.chrome.driver");
        if (chromeDriverPath != null) {
            System.setProperty("webdriver.chrome.driver", findFile("chromedriver.exe"));
        }
    }

    static private String findFile(String filename) {

        String paths[] = { "", "bin/", "target/classes" }; 
                                                           
        for (String path : paths) {
            if (new File(path + filename).exists())
                return path + filename;
        }
        return "";
    }

    public void close() {
        driver.close();
    }

    public void navigateTo(String url) {
        driver.navigate().to(url);
    }

    public void clickElement(WebElement element) {
        element.click();
    }

    public WebDriver getDriver() {
        return driver;
    }
}