// Jonathan Sonnek
// April 17 2026
// Double Factorial APP

import java.util.InputMismatchException;
import java.util.Scanner;

public class DoubleFactorialAPP {

    static int intTry(Scanner userinput, String message) {
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

    static long doubleFactorial(int number) {
        if (number <= 1){
            return 1;
        }
        return doubleFactorial(number - 2) * number;
    }

    public static void run(Scanner userinput) {
        int value;
        do {
        value = intTry(userinput,"Please enter a number:");
        } while (value > 21);

        System.out.println(doubleFactorial(value));
    }
}

