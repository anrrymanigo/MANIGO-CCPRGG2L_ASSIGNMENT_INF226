
import java.util.Scanner;

public class App {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        driving("skills");
        scan.close();
    }

    static void driving(String skills) {

        System.out.println("welcome to driving test!");
        taste(skills);

        String feedback = getFeedBack(skills);

        // Define the base case / stopping condition
        if (feedback.equals("NoPracticeMore")) {

            // Do something to reach the goal
            fix(skills);

            // Recursive call
            driving(skills);
        } else if (feedback.equals("passed")) {
            serve(skills);
        }
    }

    static void taste(String skills) {
        System.out.println("Testing driving skills");
    }

    static String getFeedBack(String skills) {
        System.out.println("Is your " + skills + " are passed or you need to practice more? (Enter \"passed\" or \"practice more\")");

        String feedback = scan.next();

        return feedback;
    }

    static void fix(String skills) {
        System.out.print("Enter additional skill to help the user improve:");
        String skill = scan.next();
        System.out.println("Practice more. Added " + skill);
    }

    static void serve(String skills) {
        System.out.println(" congratulations you passed the driving test!!!");
    }

}