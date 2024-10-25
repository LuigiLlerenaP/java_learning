package ec.Example.Employee;

import ec.Example.Employee.Employee;
import ec.Example.Employee.Gender;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println("Insert your First Name:");
        String firstName = formatString(sc.next());

        System.out.println("Insert your Last Name:");
        String lastName = formatString(sc.next());

        System.out.println("Insert your DNI:");
        String dni = sc.next().trim();
        if (dni.length() <= 0){
            throw  new Exception("Its not posible tha value");
        }

        System.out.println("Insert your Gender (FEMALE, MALE, NON_BINARY, OTHER, UNDISCLOSED):");
        String genderInput = sc.next().toUpperCase();
        Gender gender = Gender.valueOf(genderInput);


        System.out.println("Insert your Date of Entry (yyyy/mm/dd):");
        Date   dateOfEntry = null;
        try {
             dateOfEntry = format.parse(sc.next());
        }catch (ParseException e){
            System.err.println("Failed to parse date: " + e.getMessage());
        }

        System.out.println("Insert your Birthdate (yyyy/mm/dd):");
        Date birthdate = null;
        try {
            birthdate = format.parse(sc.next());
        }catch (ParseException e){
            System.err.println("Failed to parse date: " + e.getMessage());
        }

        Employee employee = new Employee(dni, firstName , lastName, gender,dateOfEntry, birthdate);

        System.out.println(employee.toString());

    }
    public  static  String formatString(String formatStr) throws Exception {
        String format = formatStr.trim();
       int lengthStr = format.length();
        if (lengthStr == 0){
             throw  new Exception("It need to pass something");
        }
         return  format.substring(0, 1).toUpperCase().concat(format.substring(1).toLowerCase());

    }
}
