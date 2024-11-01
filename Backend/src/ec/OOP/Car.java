package ec.OOP;

public class Car {
    //Those attributes are the instance
    private String cardName;
    private Color color;
    private String manufacturer;
    private String model;
    private int cylinderCapacity = 40;

    //This attribute is of the class not te instance
    //Modifier Default
    static  int  totalCars = 0;
    static int defaultWarrantyYears = 3;
    static int maxSpeedLimit = 180;


    //Constructor
    public Car() {}

    public Car(String cardName) {
        this.cardName = cardName;
    }

    public Car(String cardName, Color color) {
        this(cardName);
        this.color = color;
    }

    public Car(String cardName, Color color, String manufacturer) {
        this(cardName, color);
        this.manufacturer = manufacturer;
    }

    public Car(String cardName, Color color, String manufacturer, String model) {
        this(cardName, color, manufacturer);
        this.model = model;
    }

    public Car(String cardName, Color color, String manufacturer, String model, int cylinderCapacity) {
        this(cardName, color, manufacturer, model);
        this.cylinderCapacity = cylinderCapacity;
    }

    // Getter and Setter for cylinderCapacity
    public void setCylinderCapacity(int cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    public int getCylinderCapacity() {
        return cylinderCapacity;
    }

    // Getter and Setter for cardName
    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    // Getter and Setter for color
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    // Getter and Setter for manufacturer
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    // Getter and Setter for model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Simulates the car accelerating to a specific RPM
    public String accelerate(int rpm) {
        return String.format("The car %s accelerated to: %d RPM", cardName, rpm);
    }

    // Simulates the car decelerating to a specific RPM
    public String decelerate(int rpm) {
        return String.format("The car %s decelerated to: %d RPM", cardName, rpm);
    }

    // Simulates the car stopping
    public String stopCar() {
        return String.format("The car %s has stopped!", cardName);
    }

    // Simulates the car accelerating to a specific RPM and then stopping
    public String accelerateStopCar(int rpm) {
        return String.format("%s%n%s", accelerate(rpm), stopCar());
    }

    // Calculate fuel consumption based on distance (km) and fuel percentage
    public float calculateConsumption(int km, float percentageOfGas) {
        return km / (cylinderCapacity * percentageOfGas);
    }

    public int calculateConsumption(int km, int percentageOfGas) {
        return (int) (km / (cylinderCapacity * (percentageOfGas / 100F)));
    }

    // Overrides the equals method to compare two Card objects by manufacturer and model
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Same object reference
        }

        if (!(obj instanceof Car)) {
            return false; // Not an instance of Card
        }

        Car c = (Car) obj;
        return (this.manufacturer != null && this.model != null &&
                getManufacturer().equals(c.getManufacturer()) &&
                getModel().equals(c.getModel()));
    }

    // Overrides the toString method to provide a string representation of the Card object
    @Override
    public String toString() {
        return "Card: " + cardName + "\n" +
                "Color: " + color.getColor() + "\n" +
                "Manufacturer: " + manufacturer + "\n" +
                "Model: " + model + "\n" +
                "Cylinder Capacity: " + cylinderCapacity + " cc\n"+
                "Maximum Speed Limit: " + Car.maxSpeedLimit + "\n";
    }
}
