
import java.util.Scanner;

import javax.swing.text.Style;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        System.out.println("Give the first number:");
                int a=Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int b=Integer.valueOf(scanner.nextLine());
        int c = a+b;
        System.out.println(a + " + " + b + " = "+c);



    }
}
