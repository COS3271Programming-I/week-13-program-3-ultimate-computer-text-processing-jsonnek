// Jonathan Sonnek
// January 23 2026
// Favorite Saying

import java.util.Scanner;

public class DisplayAPP {
    public static void run(Scanner args) {

        String x,y,z;
        x = "The light shines in the darkness";
        y = "and the darkness has not overcome it.";
        z = "John 1:5";

        // Left justified with a tab
        System.out.format("\t%-40s%n",x);

        // Left justified
        System.out.format("%-40s%n",y);

        // Right justified
        System.out.format("%40s%n",z);

    }

}
