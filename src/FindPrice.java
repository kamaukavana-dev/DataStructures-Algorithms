import javax.swing.*;

public class FindPrice {
    public static void main(String[] args) {
        final int NUMBER_OF_ITEMS = 10;
        int[] validvalues = {101, 108, 201, 213, 266, 304, 311, 409, 411, 412};
        double[] prices = {0.29, 1.23, 3.50, 0.69, 6.79, 3.19, 0.99, 0.89, 1.26, 8.00};

        String strItem;
        int itemOrdered;
        double itemPrice = 0.0;
        boolean isValidItem = false;

        // Fixed: Complete the input prompt string
        strItem = JOptionPane.showInputDialog(null, "Enter the item number >>");

        // Handle case where user cancels or inputs null
        if (strItem != null) {
            try {
                itemOrdered = Integer.parseInt(strItem.trim());

                // Linear search through the parallel arrays
                for (int i = 0; i < NUMBER_OF_ITEMS; i++) {
                    if (itemOrdered == validvalues[i]) {
                        isValidItem = true;
                        itemPrice = prices[i];
                        break;
                    }
                }

                // Output the result via GUI dialog
                if (isValidItem) {
                    JOptionPane.showMessageDialog(null, "The price for item " + itemOrdered + " is $" + itemPrice);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Item: " + itemOrdered + " does not exist in the system.");
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: You must enter a valid numeric item code.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        // Clean termination for Swing applications
        System.exit(0);
    }
}