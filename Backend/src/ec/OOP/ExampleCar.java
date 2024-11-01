package ec.OOP;

public class ExampleCar {
 public static void main(String[] args) {
  Car card = new Car();
  card.setCardName("Sail");
  card.setColor(Color.GREEN);
  card.setManufacturer("Chevrolet");
  card.setModel("Sedan");

  System.out.println(card.getCardName());
  System.out.println(card);
  System.out.println(card.accelerate(400));
  System.out.println(card.stopCar());
  System.out.println(card.accelerateStopCar(300));
  System.out.printf("The km per liter: %.2f%n", card.calculateConsumption(300, 0.6F));
  System.out.printf("The km per liter: %d%n", card.calculateConsumption(300, 60));

  Car mazda = new Car("Mazda1", Color.ORANGE, "Mazda", "Sedan", 45);
  Car mazda2 = new Car("Mazda1", Color.ORANGE, "Mazda", "Sedan", 45);
  System.out.println(mazda);

  Car nissan = new Car("Navara", Color.BLUE);
  Car suzuki = new Car("Husky", Color.WHITE, "Suzuki", "Pickup");

  // Check if the objects are equal
  System.out.println(mazda == mazda2); // Compares object references
  System.out.println(mazda.equals(mazda2)); // Compares object content using overridden equals
 }
}
