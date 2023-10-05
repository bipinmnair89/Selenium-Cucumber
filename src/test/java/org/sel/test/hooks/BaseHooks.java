package org.sel.test.hooks;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import org.main.test.driver.Driver;
import org.main.test.enums.ConfigProperties;
import org.main.test.utils.PropertyUtils;

public class BaseHooks {

    @BeforeAll(order=0)
    public static void setupBrowserFeatureHook() {
        Driver.initDriver(PropertyUtils.get(ConfigProperties.BROWSER));
    }

    @AfterAll(order=0)
    public static void quitBrowserFeatureHook() {
        Driver.quitDriver();
    }
 }
