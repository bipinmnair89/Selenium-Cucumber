package org.main.test.utils;


import org.main.test.constants.FrameworkConstants;
import org.main.test.enums.ConfigProperties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

public final class PropertyUtils {

    private static Properties property = new Properties();
    private static final Map<String,String> CONFIGMAP = new HashMap<>();

    private PropertyUtils() {}

    static {
        try(FileInputStream file = new FileInputStream(FrameworkConstants.getConfigPropertiesFilePath())) {
            property.load(file);
            for(Map.Entry<Object,Object> entry : property.entrySet()) {
                CONFIGMAP.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()).trim());
            }
        } catch(IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

    public static String get(ConfigProperties key) {
        if(Objects.isNull(key) || Objects.isNull(CONFIGMAP.get(key.name().toLowerCase()))) {
            throw new IllegalArgumentException("Property name " +key+" is not found. Please check config.properties");
        }
        return CONFIGMAP.get(key.name().toLowerCase());
    }
}
