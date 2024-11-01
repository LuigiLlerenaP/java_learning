package ec.OOP.Example;

import ec.OOP.CarType;
import ec.OOP.Color;

import java.util.Arrays;

public class Car {

    private String manufacturer;
    private String model;
    private int year;
    private Color color;
    private Engine engine;
    private ContainerGas containerGas;
    private CarType type;
    private Person owner;
    private Wheel[] wheels;
    private  int indexWheel = this.wheels.length;

    private static int id = 0;


    public Car() {
        id = ++id;
    }

    public Car(Color color, ContainerGas containerGas, Engine engine, String manufacturer, String model, Person owner, CarType type, Wheel[] wheels, int year) {
        this();
        this.color = color;
        this.containerGas = containerGas;
        this.engine = engine;
        this.manufacturer = manufacturer;
        this.model = model;
        this.owner = owner;
        this.type = type;
        this.wheels = wheels;
        this.year = year;
    }
    public  void  addWheels(Wheel wheel) {
        this.wheels[indexWheel ++ ] = wheel;
    }


    @Override
    public String toString() {
        return "Car Details:\n" +
                "----------------------\n" +
                "Color          : " + color + "\n" +
                "ID             : " + id + "\n" +
                "Manufacturer   : " + manufacturer + "\n" +
                "Model          : " + model + "\n" +
                "Year           : " + year + "\n" +
                "Engine         : " + engine + "\n" +
                "Gas Capacity   : " + containerGas + " L\n" +
                "Type           : " + type + "\n" +
                "Owner          : " + owner + "\n" +
                "Wheels         : " + Arrays.toString(wheels) + "\n" +
                "----------------------";
    }

    public int getIndexWheel() {
        return indexWheel;
    }

    public void setIndexWheel(int indexWheel) {
        this.indexWheel = indexWheel;
    }
}
