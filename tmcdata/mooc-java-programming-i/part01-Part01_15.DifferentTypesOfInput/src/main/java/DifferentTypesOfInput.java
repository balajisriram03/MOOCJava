
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String answer1 = scan.nextLine();
         System.out.println("Give an integer:");
        int answer2 = Integer.valueOf(scan.nextLine());
         System.out.println("Give a double:");
        double answer3 = Double.valueOf(scan.nextLine());
         System.out.println("Give a boolean:");
        Boolean answer4 = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string " + answer1);
        System.out.println("You gave the integer "+answer2);
        System.out.println("You gave the double "+answer3);
        System.out.println("You gave the boolean "+answer4);
        
        
        
        

    }
}
