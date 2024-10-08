package ec.System;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ExampleAddPropertiesSystem {
    public static void main(String[] args) {
        try {
            // Load the config.properties file
            FileInputStream field = new FileInputStream("src/ec/System/config.properties");

            // Load existing system properties and merge with the new ones from the file
            Properties properties = new Properties(System.getProperties());
            properties.load(field);

            // Add a custom property
            properties.setProperty("my.value", "It is my value");

            // Add properties back to the system (so they are globally accessible)
            System.setProperties(properties);

            // Example of accessing a system property
            String serverPort = System.getProperty("config.server.port");
            String myValue = System.getProperty("my.value");

            System.out.println("Server port: " + serverPort);
            System.out.println("My value: " + myValue);

            // List all system properties for debugging
            System.getProperties().list(System.out);

        } catch (FileNotFoundException e) {
            System.err.println("The file is not found");
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.err.println("Error loading the properties file");
            throw new RuntimeException(e);
        }
    }
}
