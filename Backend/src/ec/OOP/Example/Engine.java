package ec.OOP.Example;

public class Engine {
    private  double  cylinder;
    private  EngineType type;

    public  Engine(){

    }
    public Engine(double cylinder, EngineType type) {
        this.cylinder = cylinder;
        this.type = type;
    }
    public double getCylinder() {
        return cylinder;
    }

    public void setCylinder(double cylinder) {
        this.cylinder = cylinder;
    }

    public EngineType getType() {
        return type;
    }

    public void setType(EngineType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Engine Details:\n" +
                "-----------------\n" +
                "Cylinder Count : " + cylinder + "\n" +
                "Engine Type    : " + type + "\n" +
                "-----------------";
    }

}
