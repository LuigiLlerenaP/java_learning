package ec.System;

import java.util.Properties;

public class ExamplePropertiesSystem {
    public static void main(String[] args) {
        // Retrieve the current user's username from system properties
        String username = System.getProperty("user.name");
        System.out.printf("Username: %s%n", username);

        // Retrieve the user's home directory from system properties
        String home = System.getProperty("user.home");
        System.out.printf("Home directory: %s%n", home);

        // Retrieve the current Java version from system properties
        String javaVersion = System.getProperty("java.version");
        System.out.printf("Java version: %s%n", javaVersion);

        // Print the line separator character
        String lineSeparator = System.lineSeparator();
        System.out.print(lineSeparator);  // Use print to show the line separator without additional new line

        // List all system properties
        Properties properties = System.getProperties();
        properties.list(System.out);
    }
}
