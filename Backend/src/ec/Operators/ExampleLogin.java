package ec.Operators;

import java.util.Scanner;

public class ExampleLogin {
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
            if (usernames[i].equals(user) && passwords[i].equals(pass)) {
                isAuthenticated = true; // Se encontró una coincidencia
                break; // Salir del bucle
            }
        }
        if(!isAuthenticated){
            System.out.println("Your credentials are incorrect.");
        }

        System.out.println("Welcome user ".concat(user).concat("!"));

    }
}
