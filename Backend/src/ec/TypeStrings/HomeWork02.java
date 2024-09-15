package ec.TypeStrings;

import java.util.Scanner;

public class HomeWork02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert the names of your family.");
        System.out.println("How many members do you have?");
        int members = sc.nextInt();
        sc.nextLine();

        // Crear arrays para nombres y apellidos
        String[] firstName = new String[members];
        String[] lastName = new String[members];
        int inserts = 0;


        while (members > inserts) {
            System.out.println("What is the name of member " + (inserts + 1) + "?");

            System.out.println("First name:");
            String fName = sc.nextLine().trim();

            fName = fName.substring(0, 1).toUpperCase() + fName.substring(1).toLowerCase();
            firstName[inserts] = fName;

            System.out.println("Last name:");
            String lName = sc.nextLine().trim();

            lName = lName.substring(0, 1).toUpperCase() + lName.substring(1).toLowerCase();
            lastName[inserts] = lName;

            inserts++;
        }


        System.out.println("\nFamily Members:");
        for (int i = 0; i < members; i++) {
            System.out.println((i + 1) + ": " + firstName[i] + " " + lastName[i]);
        }
    }
}
