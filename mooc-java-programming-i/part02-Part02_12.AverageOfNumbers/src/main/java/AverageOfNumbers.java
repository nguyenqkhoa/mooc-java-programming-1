
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numofnums = 0;
        while(true){
            System.out.println("Give a number:");
            int numberFromUser = Integer.valueOf(scanner.nextLine());

            if(numberFromUser == 0){
                break;
            }else{
                sum += numberFromUser;
                numofnums ++;
            }


        }
        double average = (double)sum/(double)numofnums;
        System.out.println("Average of the numbers: " + average);
    }
}
