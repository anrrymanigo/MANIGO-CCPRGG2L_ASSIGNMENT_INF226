import java.util.Scanner;

public class Assignment2 {

    static Scanner scan = new Scanner(System.in);
    static final int targetWeight = 150;

    public static void main(String[] args) throws Exception {

        System.out.print("Enter current weight in lbs: ");
        int weight = scan.nextInt();

        if (weight > 150) {
            loseWeight(weight);
        } 
        else if (weight== 150){
            System.out.println("I have reached my target weight!");
        }


        else {
            System.out.println("Current weight must be greater than 150 lbs!");
            
        }
        scan.close();
    }

    static void loseWeight(int currentWeight) {

        System.out.println("Eating right!");
        System.out.println("Doing exercises!");
        
        currentWeight = checkWeight(currentWeight);
        fixDietandExercise(currentWeight);
        
        done();

        
        // Define the base case by using an if condition. The target weight is 150 lbs
        // Do something to reach the target. Call the fixDietandExercise() method
        // Do the recursive call. Call the loseWeight() method
      
        // if the target weight has been reached, print the code below.
        // System.out.println("I have reached my target weight!");
           
    }

   
    

    static int fixDietandExercise(int weight) {
        
        System.out.println("Fixing Diet and Exercise!");
        System.out.print("Enter weight lost in lbs: ");
        int weightlost = scan.nextInt();
        int currentWeight = (weight - weightlost);

        return checkWeight(currentWeight);
        
    }
    static int checkWeight(int weight) {
        System.out.println("My current weight is: " + weight + "lbs");
        
        return weight;
        
    }
    static void done(){
        System.out.println("I have reached my target weight!");

    }
}
