package ec.OOP;

public class ExampleCarStatic {
    public static void main(String[] args) {
        CarStatic toyota = new CarStatic("Sedan", Color.GREEN, "Toyota", "Corolla");
        System.out.println(toyota);

        CarStatic.setDefaultSeats(4);
        CarStatic.setDefaultWarrantyYears(1);
        CarStatic.setCylinderCapacity(60);
        System.out.println("Updated car specifications:");
        toyota.setType(CarType.SEDAN);
        System.out.println(toyota);

        double travelTime = CarStatic.calculateTravelTime(45);
        System.out.printf("Estimated travel time for 45 km: %.2f hours%n", travelTime);
        System.out.println("Total Cars: " + CarStatic.totalCars);
        System.out.println("ID card: " + toyota.getId());
        System.out.println(CarStatic.MAX_SPEED_LIMIT_URBAN);
        System.out.println(CarStatic.MAX_SPEED_LIMIT_ROAD);

        System.out.println(toyota.getType());
    }
}
