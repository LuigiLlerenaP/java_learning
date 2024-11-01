package ec.OOP.Example;

public class Wheel {
    private  String manufacturer;
    private  String model;
    private  int ring;
    private int width;

    public Wheel(String manufacturer, String model, int width, int ring) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.width = width;
        this.ring = ring;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getRing() {
        return ring;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "Wheel Details:\n" +
                "-----------------\n" +
                "Manufacturer : '" + manufacturer + "'\n" +
                "Model        : '" + model + "'\n" +
                "Ring Size    : " + ring + " inches\n" +
                "Width        : " + width + " mm\n" +
                "-----------------";
    }

}
