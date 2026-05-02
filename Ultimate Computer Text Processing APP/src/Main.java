// Jonathan Sonnek
// May 1, 2026,
// Ultimate Computer Text Processing APP

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner userinput = new Scanner(System.in);

    static int intTry(String message) {
        int response;
        String dummy;
        while (true) {
            try {
                System.out.println(message);
                response = userinput.nextInt();
                return response;
            }
            catch (InputMismatchException e) {
                dummy = userinput.next();
                continue;
            }
        }
    }

    static void displayApp() {DisplayAPP.run(userinput);}

    static void textArtApp() {TextArtAPP.run(userinput);}

    static void calculatorApp() {CalculatorAPP.run(userinput);}

    static void binaryCalculatorApp() {BinaryCalculatorAPP.run(userinput);}

    static void encouragementApp() {EncouragementAPP.run(userinput);}

    static void diceApp() {DiceAPP.run(userinput);}

    static void oppishApp() {OppishAPP.run(userinput);}

    static void fibonacciApp() {FibonacciAPP.run(userinput);}

    static void doubleFactorialApp() {DoubleFactorialAPP.run(userinput);}

    public static void main(String[] args) {
        int choice;

        do {
            choice = intTry("Welcome to Ultimate Computer!\n" +
                    "Which app would you like to run?\n" +
                    "1) Display APP\n" +
                    "2) Text Art APP\n" +
                    "3) Calculator APP\n" +
                    "4) Binary Calculator APP\n" +
                    "5) Encouragement APP\n" +
                    "6) Dice APP\n" +
                    "7) Oppish APP\n" +
                    "8) Fibonacci APP\n" +
                    "9) Double Factorial APP\n" +
                    "0) Exit\n" +
                    "Enter choice: ");

            if (choice == 1) displayApp();
            else if (choice == 2) textArtApp();
            else if (choice == 3) calculatorApp();
            else if (choice == 4) binaryCalculatorApp();
            else if (choice == 5) encouragementApp();
            else if (choice == 6) diceApp();
            else if (choice == 7) oppishApp();
            else if (choice == 8) fibonacciApp();
            else if (choice == 9) doubleFactorialApp();
        } while (choice != 0);

        System.out.println("Thank you for using Ultimate Computer!");
    }
}