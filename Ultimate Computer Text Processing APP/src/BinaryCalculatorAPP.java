// Jonathan Sonnek
// February 3rd, 2026
// Binary Calculator

import java.util.Scanner;

public class BinaryCalculatorAPP {

    public static void run(Scanner userinput) {
//      Define variables and request input for them.
        String x, y;
        userinput.nextLine(); // consume leftover newline from menu nextInt()
        System.out.print("Enter a number in binary: ");
        x = userinput.nextLine();
        System.out.print("Enter a second number in binary: ");
        y = userinput.nextLine();

//      Get User input for operation
        System.out.println("Select operation (1-5)\n" +
                "1:Addition, 2:Subtraction, 3:Multiplication, 4:Division, 5:All operations:");
        int operation = userinput.nextInt();
//      Perform operation based on user input
        if (operation == 1 || operation == 5) {
            System.out.println("Sum is : " + Integer.toBinaryString(Integer.parseInt(x, 2) + Integer.parseInt(y, 2)));
        }
        if (operation == 2 || operation == 5) {
            System.out.println("Difference is : " + Integer.toBinaryString(Integer.parseInt(x, 2) - Integer.parseInt(y, 2)));
        }
        if (operation == 3 || operation == 5) {
            System.out.println("Product is : " + Integer.toBinaryString(Integer.parseInt(x, 2) * Integer.parseInt(y, 2)));
        }
        if (operation == 4 || operation == 5) {
            System.out.println("Quotient is : " + Integer.toBinaryString(Integer.parseInt(x, 2) / Integer.parseInt(y, 2)));
        }
        if (operation > 5) {
            System.out.println("Invalid operation selected.");
        }
    }
}



