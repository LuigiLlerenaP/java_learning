package ec.OOP.Example;

import ec.OOP.CarType;
import ec.OOP.Color;

public class Main {
    public static void main(String[] args) {
        Wheel[] wheelsForMazda = new Wheel[5];
        for (int i = 0; i < wheelsForMazda.length; i++) {
            wheelsForMazda[i] = new Wheel("Mazda", "Steel", 55, 17);
        }
        Wheel[] wheelsForToyota = new Wheel[5];
        for (int i = 0; i < wheelsForToyota.length; i++) {
            wheelsForToyota[i] = new Wheel("Toyota", "Alloy", 55, 18);
        }

        Car toyota = new Car(
                Color.WHITE,
                new ContainerGas(50),
                new Engine(1.8, EngineType.PETROL),
                "Toyota",
                "Corolla",
                new Person("John Doe", "1234 Main St", "john.doe@example.com"),
                CarType.SEDAN,
                wheelsForToyota,
                2024
        );

        Car mazda = new Car(
                Color.BLUE,
                new ContainerGas(55),
                new Engine(2.0, EngineType.PETROL),
                "Mazda",
                "CX-5",
                new Person("Jane Smith", "5678 Elm St", "jane.smith@example.com"),
                CarType.SUV,
                wheelsForMazda,
                2023
        );





        System.out.println(toyota);
        System.out.println(mazda);

        System.out.println(mazda);
    }
}

