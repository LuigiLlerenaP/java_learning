package ec.Example.Employee;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Employee {

    private  String dni;
    private  String firstName;
    private  String lastName;
    private  Gender gender;
    private  Date dateOfEntry;
    private  Date birthdate;
    SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

    public Employee(String dni, String firstName, String lastName, Gender gender, Date dateOfEntry, Date birthdate) {
        this.dni = dni;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfEntry = dateOfEntry;
        this.birthdate = birthdate;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getDateOfEntry() {
        return dateOfEntry;
    }

    public void setDateOfEntry(Date dateOfEntry) {
        this.dateOfEntry = dateOfEntry;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }



    public  long ageOfEmployee(){
        Date date = new Date();
        return  date.getTime() - birthdate.getTime();
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("---- Employee Details ----\n")
                .append("DNI: ").append(dni).append("\n")
                .append("First Name: ").append(firstName).append("\n")
                .append("Last Name: ").append(lastName).append("\n")
                .append("Gender: ").append(gender).append("\n")
                .append("Date of Entry: ").append(dateOfEntry).append("\n")
                .append("Birthdate: ").append(birthdate).append("\n")
                .append("Your age is :").append(ageOfEmployee()).append("\n")
                .toString();
    }
}
