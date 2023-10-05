package org.main.test.driver;

import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.WebDriver;

public final class DriverManager {

    private DriverManager() {}

    private static ThreadLocal<WebDriver> webDriverThreadLocal = new ThreadLocal<>();

    public static @NotNull WebDriver getDriver() {
        return webDriverThreadLocal.get();
    }

    static void setDriver(@NotNull WebDriver webDriver) {
        DriverManager.webDriverThreadLocal.set(webDriver);
    }

    static boolean hasDriver() {
        return webDriverThreadLocal.get() !=null;
    }

    static void unload() {
        webDriverThreadLocal.remove();
    }


}
