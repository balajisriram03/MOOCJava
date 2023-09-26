import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int case1 = a * (-1);
        if(a < 0){
            System.out.println(case1);
        } else {
            System.out.println(a);
        }
    }
}
