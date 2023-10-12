package org.sel.test.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.main.test.driver.Driver;
import org.main.test.enums.ConfigProperties;
import org.main.test.utils.PropertyUtils;

public class BaseHooks {

    @Before(order=0)
    public static void setupBrowserFeatureHook() {
        Driver.initDriver(PropertyUtils.get(ConfigProperties.BROWSER));
    }

    @After(order=0)
    public static void quitBrowserFeatureHook() {
        Driver.quitDriver();
    }

 }
