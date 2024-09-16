package ec.Operators;

public class Assignment {
    public static void main(String[] args) {
        // Initialize variables
        int numberA = 4;
        int numberB = 5;

        // Basic arithmetic operation
        int numberC = numberA + 5; // numberC = 4 + 5 = 9
        System.out.println("numberC = " + numberC);

        int numberD = 9;
        numberD += numberB + numberC; // numberD = 9 + (5 + 9) = 23
        System.out.println("numberD = " + numberD);

        int numberE = 10;
        numberE -= numberD - numberC; // numberE = 10 - (23 - 9) = -4
        System.out.println("numberE = " + numberE);

        // Using double for division
        double numberF = 11;
        numberF *= ((double) numberA / numberD); // numberF = 11 * (4 / 23.0) = 11 * 0.1739... = 1.913
        System.out.println("numberF = " + numberF);

        // Constructing a SQL query string
        String sqlUser = "SELECT username FROM user ";
        sqlUser += "WHERE username RLIKE '^.{2}b' "; // Matches any two characters followed by 'b'
        sqlUser += "AND username RLIKE 'l$';"; // Matches usernames ending with 'l'
        System.out.println("sqlUser = " + sqlUser);

    }
}
