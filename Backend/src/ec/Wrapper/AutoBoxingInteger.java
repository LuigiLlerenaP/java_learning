package ec.Wrapper;

public class AutoBoxingInteger {
    public static void main(String[] args) {
        // Create using autoboxing
        Integer[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Adding using explicit unboxing
        int add = 0;
        for (Integer i : integers) {
            if (i.intValue() % 2 == 0) {
                add += i.intValue();
            }
        }
        System.out.println("add = " + add);

        // Add using autoboxing (implicit unboxing)
        int addTwo = 0;
        for (Integer i : integers) {
            if (i % 2 == 0) {
                addTwo += i;
            }
        }
        System.out.println("addTwo = " + addTwo);
    }
}
