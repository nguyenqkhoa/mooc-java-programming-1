
import java.util.Scanner;

public class NumberAndSumOfNumbers {

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
        System.out.println("Number of numbers: " + numofnums);
        System.out.println("Sum of the numbers: " + sum);

    }
}
