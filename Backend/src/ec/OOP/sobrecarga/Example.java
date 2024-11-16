package ec.OOP.sobrecarga;
import static ec.OOP.sobrecarga.Calculate.*;

public class Example {
    public static void main(String[] args) {

        System.out.println( add(5,6));
        System.out.println(add(10.5F,5.6F));
        System.out.println(add(5,6.5F));
        System.out.println(add(5.555E3F,6));
        System.out.println(add("5","6"));
        System.out.println(add(5,6,5));
        System.out.println(add(5.5,6.6));
        System.out.println(add(55000L ,60000L));
        System.out.println(add(5,'@'));
        System.out.println(add(5F,'@'));
    }
}
