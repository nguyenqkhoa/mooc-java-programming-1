
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numofnums = 0;
        while(true){
            System.out.println("Give a number:");
            int numberFromUser = Integer.valueOf(scanner.nextLine());

            if(numberFromUser == 0){
                break;
            }else if (numberFromUser > 0){
                sum += numberFromUser;
                numofnums ++;
            }


        }
        double average = (double)sum/(double)numofnums;
        if(average > 0) {
            System.out.println(average);
        } else {
            System.out.println("Cannot calculate the average");
        }


    }
}
