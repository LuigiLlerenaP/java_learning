package ec.Wrapper;

import java.lang.reflect.Method;

public class ExampleMethodGetClass {
    public static void main(String[] args) {
        String text = "Hey, How are you?";

        // Get the class of the String instance
        Class<? extends String> strClass = text.getClass();
        System.out.println("Class Name: " + strClass.getName());
        System.out.println("Simple Name: " + strClass.getSimpleName());
        System.out.println("Package: " + strClass.getPackage());

        System.out.println("Class Object: " + strClass);

        // Iterate over and print all methods of the String class
        System.out.println("\nMethods of the String class:");
        for (Method method : strClass.getMethods()) {
            System.out.println(method.getName());
        }

        // Working with Integer class
        Integer num = 34;
        Class<? extends Integer> intClass = num.getClass();
        System.out.println("\nInteger Class Object: " + intClass);
        System.out.println("Integer Class Name: " + intClass.getName());
        System.out.println("Integer Package: " + intClass.getPackage());

        // Iterate over and print all methods of the Integer class
        System.out.println("\nMethods of the Integer class:");
        for (Method method : intClass.getMethods()) {
            System.out.println(method.getName());
        }

        // Print superclass of Integer
        System.out.println("\nSuperclass of Integer: " + intClass.getSuperclass());
        // Print superclass of Number (which is the superclass of Integer)
        System.out.println("Superclass of Number: " + intClass.getSuperclass().getSuperclass());
    }
}
