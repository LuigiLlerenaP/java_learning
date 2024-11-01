package ec.OOP.Example;

public class ContainerGas {
    private  int capacity;

    public ContainerGas() {
        this.capacity = 50;
    }

    public ContainerGas(int capacity) {
        this.capacity = capacity;
    }
    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Container Gas Details:\n" +
                "------------------------\n" +
                "Capacity: " + capacity + " liters\n" +
                "------------------------";
    }

}
