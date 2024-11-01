package ec.OOP;

public enum CarType {
    SEDAN("Sedan", 4, "A sedan has a closed body and usually four doors."),
    COUPE("Coupe", 2, "A coupe is a two-door car with a sloping rear."),
    SUV("SUV", 4, "A sport utility vehicle combines features of road-going passenger cars with off-road capabilities."),
    TRUCK("Truck", 2, "A truck is a motor vehicle designed to transport cargo."),
    CONVERTIBLE("Convertible", 2, "A convertible has a roof that can be retracted or removed."),
    HATCHBACK("Hatchback", 4, "A hatchback has a rear door that swings upward to provide access to the cargo area."),
    MINIVAN("Minivan", 4, "A minivan is designed for passenger transport with a flexible seating arrangement."),
    STATION_WAGON("Station Wagon", 4, "A station wagon has an extended rear cargo area."),
    PICKUP("Pickup", 2, "A pickup has an open rear cargo area.");

    private final String nameOfCarType;
    private final int numberOfDoors;
    private final String description;

    CarType( String nameOfCarType, int numberOfDoors , String description) {
        this.description = description;
        this.nameOfCarType = nameOfCarType;
        this.numberOfDoors = numberOfDoors;
    }

    public String getDescription() {
        return description;
    }

    public String getNameOfCarType() {
        return nameOfCarType;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public String toString() {
        return this.nameOfCarType + " " + this.numberOfDoors + " " + this.description;
    }

}
