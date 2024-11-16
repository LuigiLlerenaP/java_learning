package ec.OOP.Example;

import ec.OOP.CarType;
import ec.OOP.Color;

import java.util.Arrays;

public class MainArray {
    public static void main(String[] args) {


        Car toyota = new Car(
                Color.WHITE,
                new ContainerGas(50),
                new Engine(1.8, EngineType.PETROL),
                "Toyota",
                new Person("John Doe", "1234 Main St", "john.doe@example.com"),
                CarType.SEDAN,
                2024,
                "Corolla"
        );
        toyota.addWheels(new Wheel("Toyota", "Steel", 55, 17))
                .addWheels(new Wheel("Toyota", "Steel", 55, 17))
                .addWheels(new Wheel("Toyota", "Steel", 55, 17))
                .addWheels(new Wheel("Toyota", "Steel", 55, 17))
                .addWheels(new Wheel("Toyota", "Steel", 55, 17));

        Car mazda = new Car(
                Color.BLUE,
                new ContainerGas(55),
                new Engine(2.0, EngineType.PETROL),
                "Mazda",
                new Person("Jane Smith", "5678 Elm St", "jane.smith@example.com"),
                CarType.SUV,
                2023,
                "CX-5"
        );
        mazda.addWheels(new Wheel("Mazda", "Steel", 55, 17))
                .addWheels(new Wheel("Mazda", "Steel", 55, 17))
                .addWheels(new Wheel("Mazda", "Steel", 55, 17))
                .addWheels(new Wheel("Mazda", "Steel", 55, 17))
                .addWheels(new Wheel("Mazda", "Steel", 55, 17));


        Car honda = new Car(
                Color.RED,
                new ContainerGas(45),
                new Engine(1.5, EngineType.PETROL),
                "Honda",
                new Person("Alice Brown", "7890 Pine St", "alice.brown@example.com"),
                CarType.SEDAN,
                2022,
                "Civic"
        );
        honda.addWheels(new Wheel("Honda", "Alloy", 50, 16))
                .addWheels(new Wheel("Honda", "Alloy", 50, 16))
                .addWheels(new Wheel("Honda", "Alloy", 50, 16))
                .addWheels(new Wheel("Honda", "Alloy", 50, 16))
                .addWheels(new Wheel("Honda", "Alloy", 50, 16));

        Car ford = new Car(
                Color.BLACK,
                new ContainerGas(60),
                new Engine(3.0, EngineType.DIESEL),
                "Ford",
                new Person("Bob Green", "123 Cedar Rd", "bob.green@example.com"),
                CarType.TRUCK,
                2021,
                "F-150"
        );
        ford.addWheels(new Wheel("Ford", "Steel", 60, 18))
                .addWheels(new Wheel("Ford", "Steel", 60, 18))
                .addWheels(new Wheel("Ford", "Steel", 60, 18))
                .addWheels(new Wheel("Ford", "Steel", 60, 18))
                .addWheels(new Wheel("Ford", "Steel", 60, 18));

        Car bmw = new Car(
                Color.GREEN,
                new ContainerGas(55),
                new Engine(2.0, EngineType.PETROL),
                "BMW",
                new Person("Charlie Davis", "456 Maple Ave", "charlie.davis@example.com"),
                CarType.SUV,
                2023,
                "X3"
        );
        bmw.addWheels(new Wheel("BMW", "Alloy", 55, 19))
                .addWheels(new Wheel("BMW", "Alloy", 55, 19))
                .addWheels(new Wheel("BMW", "Alloy", 55, 19))
                .addWheels(new Wheel("BMW", "Alloy", 55, 19))
                .addWheels(new Wheel("BMW", "Alloy", 55, 19));

        Car audi = new Car(
                Color.WHITE,
                new ContainerGas(50),
                new Engine(2.5, EngineType.PETROL),
                "Audi",
                new Person("Diana Evans", "567 Oak St", "diana.evans@example.com"),
                CarType.SEDAN,
                2024,
                "A4"
        );
        audi.addWheels(new Wheel("Audi", "Alloy", 50, 17))
                .addWheels(new Wheel("Audi", "Alloy", 50, 17))
                .addWheels(new Wheel("Audi", "Alloy", 50, 17))
                .addWheels(new Wheel("Audi", "Alloy", 50, 17))
                .addWheels(new Wheel("Audi", "Alloy", 50, 17));

        Car chevrolet = new Car(
                Color.YELLOW,
                new ContainerGas(48),
                new Engine(1.4, EngineType.PETROL),
                "Chevrolet",
                new Person("Eve Foster", "789 Elm Rd", "eve.foster@example.com"),
                CarType.HATCHBACK,
                2020,
                "Spark"
        );
        chevrolet.addWheels(new Wheel("Chevrolet", "Steel", 48, 15))
                .addWheels(new Wheel("Chevrolet", "Steel", 48, 15))
                .addWheels(new Wheel("Chevrolet", "Steel", 48, 15))
                .addWheels(new Wheel("Chevrolet", "Steel", 48, 15))
                .addWheels(new Wheel("Chevrolet", "Steel", 48, 15));

        Car nissan = new Car(
                Color.GREEN,
                new ContainerGas(52),
                new Engine(2.0, EngineType.PETROL),
                "Nissan",
                new Person("Frank Hill", "123 Birch Ln", "frank.hill@example.com"),
                CarType.SUV,
                2023,
                "Rogue"
        );
        nissan.addWheels(new Wheel("Nissan", "Alloy", 52, 17))
                .addWheels(new Wheel("Nissan", "Alloy", 52, 17))
                .addWheels(new Wheel("Nissan", "Alloy", 52, 17))
                .addWheels(new Wheel("Nissan", "Alloy", 52, 17))
                .addWheels(new Wheel("Nissan", "Alloy", 52, 17));

        Car jeep = new Car(
                Color.ORANGE,
                new ContainerGas(65),
                new Engine(3.6, EngineType.PETROL),
                "Jeep",
                new Person("Grace White", "456 Spruce St", "grace.white@example.com"),
                CarType.SUV,
                2022,
                "Wrangler"
        );
        jeep.addWheels(new Wheel("Jeep", "Steel", 65, 18))
                .addWheels(new Wheel("Jeep", "Steel", 65, 18))
                .addWheels(new Wheel("Jeep", "Steel", 65, 18))
                .addWheels(new Wheel("Jeep", "Steel", 65, 18))
                .addWheels(new Wheel("Jeep", "Steel", 65, 18));

        Car kia = new Car(
                Color.RED,
                new ContainerGas(47),
                new Engine(1.6, EngineType.PETROL),
                "Kia",
                new Person("Henry Brown", "567 Aspen Ave", "henry.brown@example.com"),
                CarType.SEDAN,
                2021,
                "Forte"
        );
        kia.addWheels(new Wheel("Kia", "Alloy", 47, 16))
                .addWheels(new Wheel("Kia", "Alloy", 47, 16))
                .addWheels(new Wheel("Kia", "Alloy", 47, 16))
                .addWheels(new Wheel("Kia", "Alloy", 47, 16))
                .addWheels(new Wheel("Kia", "Alloy", 47, 16));

        Car mercedes = new Car(
                Color.WHITE,
                new ContainerGas(58),
                new Engine(2.0, EngineType.PETROL),
                "Mercedes-Benz",
                new Person("Isabella Green", "789 Pine St", "isabella.green@example.com"),
                CarType.SEDAN,
                2024,
                "C-Class"
        );
        mercedes.addWheels(new Wheel("Mercedes", "Alloy", 58, 18))
                .addWheels(new Wheel("Mercedes", "Alloy", 58, 18))
                .addWheels(new Wheel("Mercedes", "Alloy", 58, 18))
                .addWheels(new Wheel("Mercedes", "Alloy", 58, 18))
                .addWheels(new Wheel("Mercedes", "Alloy", 58, 18));

        Car volkswagen = new Car(
                Color.BLUE,
                new ContainerGas(53),
                new Engine(1.4, EngineType.PETROL),
                "Volkswagen",
                new Person("Jack Black", "234 Cedar Rd", "jack.black@example.com"),
                CarType.SUV,
                2022,
                "Tiguan"
        );
        volkswagen.addWheels(new Wheel("Volkswagen", "Steel", 53, 16))
                .addWheels(new Wheel("Volkswagen", "Steel", 53, 16))
                .addWheels(new Wheel("Volkswagen", "Steel", 53, 16))
                .addWheels(new Wheel("Volkswagen", "Steel", 53, 16))
                .addWheels(new Wheel("Volkswagen", "Steel", 53, 16));

        Car[] cars = new Car[11];
        cars[0] = toyota;
        cars[1] = mazda;
        cars[2] = honda;
        cars[3] = ford;
        cars[4] = bmw;
        cars[5] = audi;
        cars[6] = chevrolet;
        cars[7] = nissan;
        cars[8] = jeep;
        cars[9] = kia;
        cars[10] = mercedes;

        Arrays.sort(cars);

        for (Car car : cars) {
            System.out.println(car);
        }

    }
}

