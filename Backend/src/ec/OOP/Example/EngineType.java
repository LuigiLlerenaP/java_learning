package ec.OOP.Example;

public enum EngineType {
    DIESEL("Efficient, high torque"),
    PETROL("Smooth, common fuel"),
    ELECTRIC("Zero emissions, battery-powered");

    private final String description;

    EngineType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return this.description;
    }
}
