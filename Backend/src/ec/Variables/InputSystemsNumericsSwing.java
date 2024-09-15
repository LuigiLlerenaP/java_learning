package ec.Variables;

import javax.swing.*;

public class InputSystemsNumericsSwing {
    public static void main(String[] args) {
        String numberStr = JOptionPane.showInputDialog(null, "Insert an integer value");
        try {
            if (numberStr.trim().isEmpty()){
                JOptionPane.showMessageDialog(null, "You need to insert a number.");
                throw new IllegalArgumentException("Empty input provided");
            }
            int numberDecimal = Integer.parseInt(numberStr);
            String message = "The integer you entered is : " + numberDecimal + "\n";
            message += "Number decimal to binary = "+Integer.toBinaryString(numberDecimal)+"\n";
            message += "Number decimal to octal = "+Integer.toOctalString(numberDecimal)+"\n";
            message  += "Number decimal to hexadecimal ="+ Integer.toHexString(numberDecimal)+"\n";
            JOptionPane.showMessageDialog(null, message);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Invalid input, please enter a valid value integer");
            main(args);
            System.exit(0);
        }catch (IllegalArgumentException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            main(args);
            System.exit(0);
        }
    }
}
