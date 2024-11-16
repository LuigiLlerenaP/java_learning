package ec.OOP.exampleInvoice;

import ec.OOP.exampleInvoice.org.luigi.invoice.model.*;

import java.util.Scanner;

public class ExampleInvoice {
    public static void main(String[] args) {
        Client client = new Client();
        client.setCompleteName("Luigi Llerena");
        client.setNif("1751388214");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert the description of the invoice: ");

        Invoice invoice = new Invoice(client, scanner.nextLine());



        System.out.println();
        for (int i = 0; i < 2; i++) {
            Product product = new Product();

            System.out.print("Enter the name of product " + product.getCode() + ": ");
            product.setNameProduct(scanner.nextLine());

            System.out.print("Enter the price of the product: ");
            product.setPrice(scanner.nextFloat());

            System.out.print("Enter the amount of the product: ");
            invoice.addDetails(new InvoiceDetails(scanner.nextInt(), product));

            scanner.nextLine();

            System.out.println();
        }

        System.out.println(invoice);


    }
}
