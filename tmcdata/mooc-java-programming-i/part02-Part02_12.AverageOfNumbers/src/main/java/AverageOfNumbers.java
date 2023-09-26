
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count=0;
        int sum=0;
        double avgsum=0;
        while(true){
            System.out.println("Give a number:");
            int num=scanner.nextInt();
            if(num==0){
                break;
            }else{
                count+=1;
                sum+=num;
                avgsum =(double)sum/count;
                
            }
        }
        System.out.println("Average of the numbers: " +avgsum);
    }
}
