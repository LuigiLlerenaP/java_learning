package ec.Variables;
import java.time.LocalDate;
import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate invoiceDate = LocalDate.now();
        System.out.println("Invoice Date: " + invoiceDate);

        System.out.println("Insert your Name or Company Name: ");
        String name = sc.nextLine();

        System.out.println("Insert your address: ");
        String address = sc.nextLine();

        System.out.println("Insert your DNI: ");
        String dni = sc.nextLine();

        System.out.println("Insert your Email: ");
        String email = sc.nextLine();

        System.out.println("Insert your Phone: ");
        int phoneNumber = sc.nextInt();
        sc.nextLine();

        System.out.println("Insert the invoice number: ");
        String invoiceNumber = sc.nextLine();

        System.out.println("Insert the number of items: ");
        int itemCount = sc.nextInt();

        double totalInvoiceAmount = 0.0;
        for (int i = 1; i <= itemCount; i++) {
            System.out.println("Insert Name of the item " + i + ": ");
            String itemName = sc.nextLine();

            System.out.println("Insert quantity of the products: ");
            int quantityItem = sc.nextInt();

            System.out.println("Insert price per item: ");
            double priceItem = sc.nextDouble();
            sc.nextLine();  // Consumir la nueva línea pendiente

            System.out.println("Insert description: ");
            String description = sc.nextLine();

            double totalItemPrice = quantityItem * priceItem;
            totalInvoiceAmount += totalItemPrice;

            System.out.println("Item " + i + " - " + itemName + ": Quantity = " + quantityItem + ", Unit Price = " + priceItem + ", Total = " + totalItemPrice);
        }

        System.out.println("Invoice Summary:");
        System.out.println("Name or Company: " + name);
        System.out.println("Address: " + address);
        System.out.println("DNI: " + dni);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Invoice Number: " + invoiceNumber);
        System.out.println("Total Amount Due: " + totalInvoiceAmount);

    }
}
