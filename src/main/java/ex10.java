/*
 *  UCF COP3330 Summer 2021 Assignment 10 Solution
 *  Copyright 2021 Brandon Powell
 */
/*Exercise 10 - Self-Checkout

Working with multiple inputs and currency can introduce some tricky precision issues.

Create a simple self-checkout system. Prompt for the prices and quantities of three items. Calculate the subtotal of the items. Then calculate the tax using a tax rate of 5.5%. Print out the line items with the quantity and total, and then print out the subtotal, tax amount, and total.

Example Output

Enter the price of item 1: 25
Enter the quantity of item 1: 2
Enter the price of item 2: 10
Enter the quantity of item 2: 1
Enter the price of item 3: 4
Enter the quantity of item 3: 1
Subtotal: $64.00
Tax: $3.52
Total: $67.52

Constraints

Keep the input, processing, and output parts of your program separate. Collect the input, then do the math operations and string building, and then print out the output.
Be sure you explicitly convert input to numerical data before doing any calculations.
Challenges

Revise the program to ensure that prices and quantities are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
Alter the program so that an indeterminate number of items can be entered. The tax and total are computed when there are no more items to be entered.

 */
import java.util.Scanner;
public class ex10 {
    public static void main(String[] args) {
        //inputs
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the price of item 1: ");
        String string1 = in.nextLine();
        double item1 = Double.parseDouble(string1);

        System.out.print("Enter the quantity of item 1: ");
        String string2 = in.nextLine();
        int Item1Quantity = Integer.parseInt(string2);

        System.out.print("Enter the price of item 2: ");
        String string3 = in.nextLine();
        double item2 = Double.parseDouble(string3);

        System.out.print("Enter the quantity of item 2: ");
        String string4 = in.nextLine();
        int Item2Quantity = Integer.parseInt(string4);

        System.out.print("Enter the price of item 3: ");
        String string5 = in.nextLine();
        double item3 = Double.parseDouble(string5);

        System.out.print("Enter the quantity of item 3: ");
        String string6 = in.nextLine();
        int Item3Quantity = Integer.parseInt(string6);

        //calculations
        double subtotal = ((item1*Item1Quantity)+(item2*Item2Quantity)+(item3*Item3Quantity));
        double tax = subtotal*5.5/100;
        double total = subtotal+tax;

        //output
        System.out.println(String.format("Subtotal: $%.2f",subtotal));
        System.out.println(String.format("Tax: $%.2f",tax));
        System.out.print(String.format("Total: $%.2f",total));


    }
}
