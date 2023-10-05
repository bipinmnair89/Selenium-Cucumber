package org.main.test.constants;

public final class FrameworkConstants {

    private FrameworkConstants(){}

    private static final String CONFIG_PROPERTIES_FILE_PATH = "src/test/resources/config.properties";
    public static String getConfigPropertiesFilePath() {
        return CONFIG_PROPERTIES_FILE_PATH;
    }
}
