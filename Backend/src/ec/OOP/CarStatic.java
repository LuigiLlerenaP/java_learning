package ec.OOP;

public class CarStatic {
    //Const
    public static final int MAX_SPEED_LIMIT_URBAN = 50;
    public static final int MAX_SPEED_LIMIT_ROAD = 120;
    public static final Color DEFAULT_COLOR = Color.BLACK;
    public static final String DEFAULT_MANUFACTURER = "Japan";
    public static final String DEFAULT_MODEL = "Suzuki";
    public static final int DEFAULT_WARRANTY_YEARS = 3;

    // These attributes are specific to each instance
    private String carName;
    private Color color = DEFAULT_COLOR;
    private String manufacturer = DEFAULT_MANUFACTURER;
    private String model = DEFAULT_MODEL;
    private  int id;

    // These attributes belong to the class, not to individual instances
    // The access modifier is default
    static int totalCars = 0;

    private static int cylinderCapacity = 40;
    private static int defaultWarrantyYears = DEFAULT_WARRANTY_YEARS;
    private static int maxSpeedLimit = 180;
    private static String fuelType = "Gasoline";
    private static int minSpeedLimit = 0;
    private static int defaultSeats = 5;
    private  static  int lastId ;

    //Attribute of the enum type
    private  CarType type;



    //Constructors
    public CarStatic() {
        CarStatic.totalCars++;
        this.id = ++lastId;
    }
    public CarStatic(String carName) {
        this();
        this.carName = carName;
    }
    public CarStatic(String carName, Color color) {
        this(carName);
        this.color = color;
    }
    public CarStatic(String carName, Color color , String manufacturer) {
        this(carName, color);
        this.manufacturer = manufacturer;
    }

    public CarStatic(String carName, Color color, String manufacturer, String model) {
        this(carName, color , manufacturer);
        this.model = model;
    }

    public CarStatic(String carName, Color color, String manufacturer, String model , CarType type ) {
        this(carName, color, manufacturer, model);
        this.type = type;
    }

    public String getCarName() {
        return carName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getDefaultSeats() {
        return defaultSeats;
    }

    public static int getMinSpeedLimit() {
        return minSpeedLimit;
    }

    public static String getFuelType() {
        return fuelType;
    }

    public static int getMaxSpeedLimit() {
        return maxSpeedLimit;
    }

    public static int getDefaultWarrantyYears() {
        return defaultWarrantyYears;
    }

    public static int getCylinderCapacity() {
        return cylinderCapacity;
    }

    public static int getTotalCars() {
        return totalCars;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Color getColor() {
        return color;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public static void setCylinderCapacity(int cylinderCapacity) {
        CarStatic.cylinderCapacity = cylinderCapacity;
    }

    public static void setDefaultSeats(int defaultSeats) {
        CarStatic.defaultSeats = defaultSeats;
    }

    public static void setDefaultWarrantyYears(int defaultWarrantyYears) {
        CarStatic.defaultWarrantyYears = defaultWarrantyYears;
    }

    public static void setFuelType(String fuelType) {
        CarStatic.fuelType = fuelType;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public static void setMaxSpeedLimit(int maxSpeedLimit) {
        CarStatic.maxSpeedLimit = maxSpeedLimit;
    }

    public static void setMinSpeedLimit(int minSpeedLimit) {
        CarStatic.minSpeedLimit = minSpeedLimit;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static void setTotalCars(int totalCars) {
        CarStatic.totalCars = totalCars;
    }

    public  static  double calculateTravelTime(double distance ){
        if (maxSpeedLimit <= 0) {
            throw new IllegalArgumentException("Max speed limit must be greater than zero.");
        }
        return  distance/ CarStatic.maxSpeedLimit ;
    }

    public static int getLastId() {
        return lastId;
    }

    public static void setLastId(int lastId) {
        CarStatic.lastId = lastId;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "CarStatic {" +
                "\n   carName: '" + carName + "'," +
                "\n   color: '" + color.getColor()+ "'," +
                "\n   manufacturer: '" + manufacturer + "'," +
                "\n   model: '" + model + "'," +
                "\n   cylinderCapacity: '" + cylinderCapacity + "'," +
                "\n   defaultWarrantyYears: '" + defaultWarrantyYears + "'," +
                "\n   maxSpeedLimit: '" + maxSpeedLimit + "'," +
                "\n   defaultSeats: '" + defaultSeats + "'," +
                "\n   fuelType: '" + fuelType + "'" +
                "\n   description Car " + this.getType().getDescription() +
                "\n}";
    }


}
