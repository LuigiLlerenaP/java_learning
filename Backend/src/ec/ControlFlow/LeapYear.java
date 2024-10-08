package ec.ControlFlow;



import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the year to check if it is a leap year:");

        int year = sc.nextInt();

        if (year % 400 == 0 ||( year %4 == 0 && year % 100 != 0)){
            System.out.println(year + " is a leap year.");
            return;
        }
        System.out.println(year + " is not a leap year.");

    }
}
