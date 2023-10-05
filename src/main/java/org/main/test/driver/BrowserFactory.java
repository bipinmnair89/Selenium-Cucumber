package org.main.test.driver;

import org.jetbrains.annotations.NotNull;
import org.main.test.enums.BrowserProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public final class BrowserFactory {

    private BrowserFactory() {}

    public static @NotNull WebDriver getBrowserDriver(@NotNull String browser) {
        WebDriver driver;
        if(browser.equalsIgnoreCase(String.valueOf(BrowserProperties.CHROME))) {
            driver = new ChromeDriver();
        } else if(browser.equalsIgnoreCase(String.valueOf(BrowserProperties.FIREFOX))) {
            driver = new FirefoxDriver();
        } else if(browser.equalsIgnoreCase(String.valueOf(BrowserProperties.EDGE))) {
            driver = new EdgeDriver();
        } else {
            throw new IllegalArgumentException("Please provide proper browser name");
        }
        return  driver;
    }
}
