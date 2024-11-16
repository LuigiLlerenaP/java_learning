package ec.OOP.Example;

import ec.OOP.CarType;
import ec.OOP.Color;

import java.util.Arrays;

public class Car implements Comparable<Car>{

    private String manufacturer;
    private String model;
    private int year;
    private Color color;
    private Engine engine;
    private ContainerGas containerGas;
    private CarType type;
    private Person owner;
    private Wheel[] wheels;
    private  int indexWheel = 0;

    private static int id = 0;


    public Car() {
        id = ++id;
        this.wheels = new Wheel[5];
    }

    public Car(Color color, ContainerGas containerGas, Engine engine, String manufacturer, Person owner, CarType type, int year, String model) {
        this();
        this.color = color;
        this.containerGas = containerGas;
        this.engine = engine;
        this.manufacturer = manufacturer;
        this.owner = owner;
        this.type = type;
        this.year = year;
        this.model = model;
    }

    public Car(Color color, ContainerGas containerGas, Engine engine, String manufacturer, String model, Person owner, CarType type, Wheel[] wheels, int year) {
        this(color, containerGas, engine, manufacturer, owner, type, year, model);
        this.wheels = wheels;
    }
    public  Car addWheels(Wheel wheel) {
        if (indexWheel<this.wheels.length) {
            this.wheels[indexWheel ++ ] = wheel;
        }
        return this;
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


    @Override
    public int compareTo(Car o) {
        return this.manufacturer.compareTo(((Car) o).manufacturer);
    }
}
