package ec.System;

import java.util.Map;

public class ExampleEnvironment {
    public static void main(String[] args) {
        // Retrieve all environment variables
        Map<String, String> varEnvironment = System.getenv();
        // Print all environment variables
        System.out.println("All environment variables: " + varEnvironment);

        // Retrieve and print specific environment variables
        String username = System.getenv("USERNAME");
        System.out.println("Username: " + username); // Print the current username

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("JAVA_HOME: " + javaHome); // Print the path of the Java installation

        String tempDir = System.getenv("TEMP");
        System.out.println("Temporary Directory: " + tempDir); // Print the temporary directory

        String path = varEnvironment.get("Path"); // Retrieve the system path
        System.out.println("System PATH: " + path); // Print the system path
    }
}
