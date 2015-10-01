package com.qaworks.test.common;


import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyHelper {

    public static Properties loadProperties() {
        return new PropertyHelper().getProperties();
    }

    private Properties getProperties() {

        String fileName = "message.properties";

        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(fileName);

        Properties properties = new Properties();
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return properties;
    }

}
