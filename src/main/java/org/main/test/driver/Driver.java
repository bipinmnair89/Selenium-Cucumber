package org.main.test.driver;

import org.main.test.enums.ConfigProperties;
import org.main.test.utils.PropertyUtils;
import org.openqa.selenium.WebDriver;

public final class Driver {

    private Driver() {}

    public static void initDriver(String browser) {
        if(!DriverManager.hasDriver()) {
            WebDriver browserDriver = BrowserFactory.getBrowserDriver(browser);
            DriverManager.setDriver(browserDriver);
            DriverManager.getDriver().get(PropertyUtils.get(ConfigProperties.URL));
            browserDriver.manage().window().maximize();
        }
    }

    public static void quitDriver() {
        if(DriverManager.hasDriver()) {
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }
    }



}

