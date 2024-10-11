package ec.Examples;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ring r = new Ring(50,25);


        System.out.printf("Initial Area: %d square units%n", r.calculateArea());
        System.out.printf("Initial Perimeter: %d units%n", r.calculatePerimeter());


        System.out.println("Set the height: ");
        r.setHeight(sc.nextInt());

        System.out.println("Set the width: ");
        r.setWidth(sc.nextInt());


        System.out.printf("New Area: %d square units%n", r.calculateArea());
        System.out.printf("New Perimeter: %d units%n", r.calculatePerimeter());

    }
}
