package ec.Operators;

import java.util.Scanner;

public class ExampleLoginTernary {
    public static void main(String[] args) {
        String [] usernames = {"luigi","antony","admin"};
        String [] passwords = {"1234","admin","l123"};

        Scanner sc = new Scanner(System.in);

        System.out.print("Insert your username: ");
        String user = sc.next();

        System.out.print("Insert your password: ");
        String pass = sc.next();

        boolean isAuthenticated = false;

        for (int i = 0; i < usernames.length; i++) {
            isAuthenticated=(usernames[i].equals(user) && passwords[i].equals(pass))?true:isAuthenticated;
            // break; More efficient, stop searching once a match is found
        }

        String message = isAuthenticated ? "Welcome user \"" + user + "\"!" : "Your credentials are incorrect.";

        System.out.println(message);

    }
}
