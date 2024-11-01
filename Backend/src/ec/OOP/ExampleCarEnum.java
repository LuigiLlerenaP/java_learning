package ec.OOP;

public class ExampleCarEnum {
    public static void main(String[] args) {
        CarStatic toyota = new CarStatic(
                "Toyota Corolla",
                Color.WHITE,
                "2024",
                "Toyota",
                CarType.SEDAN
        );

        CarStatic mazda = new CarStatic(
                "Mazda CX-5",
                Color.BLUE,
                "2023",
                "Mazda",
                CarType.SUV
        );


        System.out.println(toyota.getType().getNameOfCarType());
        System.out.println(mazda.getType().getNameOfCarType());

        printCarDescription(toyota);
        printCarDescription(mazda);


        for (CarType type : CarType.values()) {
            System.out.println(type.getNameOfCarType());
        }
    }


    private static void printCarDescription(CarStatic car) {
        CarType typeCar = car.getType();
        String description = switch (typeCar) {
            case SEDAN -> "This is a sedan with a classic four-door design, offering ample seating and a spacious trunk.";
            case SUV -> "This is an SUV, a sport utility vehicle with four doors and versatile space for both passengers and cargo.";
            case COUPE -> "This is a coupe, a compact and sporty two-door vehicle often designed for a sleek appearance.";
            case TRUCK -> "This is a truck with two doors, typically built for hauling and heavy-duty work with a large cargo bed.";
            case PICKUP -> "This is a pickup truck, featuring a two-door cab and an open bed, ideal for transporting goods.";
            case MINIVAN -> "This is a minivan with four doors, optimized for family use with roomy seating and convenient sliding doors.";
            case HATCHBACK -> "This is a hatchback, a four-door car with a rear hatch for easy cargo access, blending compactness with utility.";
            case CONVERTIBLE -> "This is a convertible with two doors and a retractable roof, designed for open-air driving experiences.";
            case STATION_WAGON -> "This is a station wagon, a four-door vehicle offering extended cargo space with a rear hatch door.";
            default -> "This vehicle type is unknown, and specific details are unavailable.";
        };
        System.out.println(description);
    }
}
