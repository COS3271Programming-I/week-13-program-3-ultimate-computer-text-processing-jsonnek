// Jonathan Sonnek
// February 3rd, 2026
// Calculator APP

import java.util.Scanner;

public class CalculatorAPP {
  public static void run(Scanner userinput) {
//  Define Variables
    double x, y;
//  Get User input for numbers
    System.out.println("Enter first number (x): ");
    x = userinput.nextDouble();
    System.out.println("Enter second number (y): ");
    y = userinput.nextDouble();
//  Get User input for operation
    System.out.println("Select operation (1-6)\n" +
            "1:Addition, 2:Multiplication, 3:Division, 4:Exponent (x^y), 5:Logarithm (log base y of x), 6:All operations: ");
    int operation = userinput.nextInt();
//  Perform operation based on user input
    if (operation == 1 || operation == 6) {
      System.out.println("Addition:\n" +
              "x + y = " + (x+y));
    }
    if (operation == 2 || operation == 6) {
      System.out.println("Multiplication:\n" +
              " x * y = " + (x*y));
    }
    if (operation == 3 || operation == 6) {
      System.out.println("Division:\n" +
              "x / y = " + (x/y));
    }
    if (operation == 4 || operation == 6) {
      System.out.println("Exponent:\n" +
              "x^y = " + Math.pow(x, y));
    }
    if (operation == 5 || operation == 6) {
      System.out.println("Logarithm:\n" +
              "log base y of x = " + Math.log(x) / Math.log(y));
    }
    if (operation > 6) {
      System.out.println("Invalid operation selected.");
    }
  }
}
