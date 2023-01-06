import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // Java program to check if a student number is valid
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter student Email: ");
        String studentE = scan.nextLine();

        // Long method
        Pattern pattern = Pattern.compile("\\w{8}\\@students.national-u.edu.ph");
        Matcher matcher = pattern.matcher(studentE);

        boolean match = matcher.matches();

        if (match) {
            System.out.println("<<<<valid student Email>>>>");
        } else {
            System.out.println("invalid student Email");
        }
       
        System.out.print("Enter phone number: ");
        String phoneNum = scan.nextLine();

        Pattern pattern2 = Pattern.compile("\\+63\\d{10}\\");
        Matcher matcher2 = pattern.matcher(phoneNum);

        boolean match2 = matcher.matches();
        if (match2) {
            System.out.println("<<<<valid phone number>>>>");
        } else {
            System.out.println("invalid phone number");
        }
        System.out.print("Enter your birthdate: ");
        String birthdate = scan.nextLine();
        Pattern pattern3 = Pattern.compile("\\d{4}\\-d{2}\\d{2}");
        Matcher matcher3 = pattern.matcher(birthdate);

        boolean match3 = matcher.matches();

        if (match3) {
            System.out.println("<<<<valid birthdate>>>>");
        } else {
            System.out.println("invalid birthdate");
        }
    }
    
    }
