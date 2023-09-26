
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int a = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int b = Integer.valueOf(scanner.nextLine());
        int add = a+b;
        int sub = a-b;
        int product = a*b;
        double division = (double) a/b;
        System.out.println(a+ " + " + b +" = "+ add);
        System.out.println(a+ " - " + b +" = "+ sub);
        System.out.println(a+ " * " + b +" = "+ product);
        System.out.println(a+ " / " + b +" = "+ division);


    }
}
