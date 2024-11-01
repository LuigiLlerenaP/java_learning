package ec.OOP;

public enum Color {
    // Invoke the constructor and pass the value as a parameter to customize the enum
    BLACK("Black"),
    WHITE("White"),
    RED("Red"),
    BLUE("Blue"),
    GREEN("Green"),
    YELLOW("Yellow"),
    ORANGE("Orange");

    private final String color;

    Color(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return this.color;
    }
}
