import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        double avg = 0;

        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            } else if (num < 0) {
                System.out.println("Please enter only positive numbers.");
            } else {
                count += 1;
                sum += num;
            }
        }

        if (count == 0) {
            System.out.println("Cannot calculate the average.");
        } else {
            avg = (double) sum / count;
            System.out.println("The average is: " + avg);
        }
    }
}
