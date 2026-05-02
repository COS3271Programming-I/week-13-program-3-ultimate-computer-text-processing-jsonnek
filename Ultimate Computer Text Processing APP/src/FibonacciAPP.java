// Jonathan Sonnek
// March 6th 2026
// Fibonacci Sequence App

import java.util.Arrays;
import java.util.Scanner;
public class FibonacciAPP {
    public static void run(Scanner userinput) {
        System.out.println("How many numbers of the Fibonacci sequence would you like?");
        int n = userinput.nextInt();
        int[] fibSequence = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                fibSequence[i] = 0;
            } else if (i == 1) {
                fibSequence[i] = 1;
            } else {
                fibSequence[i] = fibSequence[i - 1] + fibSequence[i - 2];
            }
        }
        System.out.println("The first " + n + " Fibonacci numbers are: " + Arrays.toString(fibSequence));
    }
}