package ec.OOP;

public class ExampleCard {
 public static void main(String[] args) {
  Card card = new Card();
  card.setCardName("Sail");
  card.setColor("Red");
  card.setManufacturer("Chevrolet");
  card.setModel("Sedan");

  System.out.println(card.getCardName());
  System.out.println(card);
  System.out.println(card.accelerate(400));
  System.out.println(card.stopCar());
  System.out.println(card.accelerateStopCar(300));
  System.out.printf("The km per liter: %.2f%n", card.calculateConsumption(300, 0.6F));
  System.out.printf("The km per liter: %d%n", card.calculateConsumption(300, 60));

  Card mazda = new Card("Mazda1", "Red", "Mazda", "Sedan", 45);
  Card mazda2 = new Card("Mazda1", "Red", "Mazda", "Sedan", 45);
  System.out.println(mazda);

  Card nissan = new Card("Navara", "Black");
  Card suzuki = new Card("Husky", "White", "Suzuki", "Pickup");

  // Check if the objects are equal
  System.out.println(mazda == mazda2); // Compares object references
  System.out.println(mazda.equals(mazda2)); // Compares object content using overridden equals
 }
}
