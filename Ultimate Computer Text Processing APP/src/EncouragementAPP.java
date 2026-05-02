// Jonathan Sonnek
// February 12, 2026
// Encouragement App 2.0

import java.util.Scanner;
public class EncouragementAPP {
    public static void run(Scanner userinput) {
        int age;
        String condition;
//      Ask the user for their age
        System.out.println("Please enter your age: ");
        age = userinput.nextInt();
        userinput.nextLine(); // consume leftover newline
//      How is the user? Good, ok, or bad?
        System.out.println("How are you today? (good/ok/bad): ");
        condition = userinput.nextLine().toLowerCase().trim();

//      If statements to determine the response based on the user's input for condition and age
        if (condition.equals("good") && age < 18) {
            System.out.println("That's great to hear! Keep up the good work in school!");
        } else if (condition.equals("good") && age >= 18) {
            System.out.println("Awesome! Keep striving for your goals!");
        } else if (condition.equals("ok") && age < 18) {
            System.out.println("It’s totally normal to have an off day. " +
                    "Take a breath and reset — you’ve got this.");
        } else if (condition.equals("ok") && age >= 18) {
            System.out.println("Some days are just steady days. " +
                    "Do one small win today and call it progress.");
        } else if (condition.equals("bad") && age < 18) {
            System.out.println("That’s rough, but bad days don’t define you. " +
                    "Shake it off and focus on one small thing you can control.");
        } else if (condition.equals("bad") && age >= 18) {
            System.out.println("Tough days happen. Keep your head up — " +
                    "tomorrow’s another chance to turn it around.");
        }
        else {
            System.out.println("Please restart and choose good, ok, or bad.");
        }
    }
}

