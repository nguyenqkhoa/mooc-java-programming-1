
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = 0;
        while (true) {
            System.out.println("Give a number:");
            // The task is to read a user inputted number
            int number = Integer.valueOf(scanner.nextLine());

            // The task is to exit the loop if the user
            // has inputted zero
            if (number == 0) {
                break;
            } else if (number < 0) {
                numbers = numbers + 1;
            }


        }

// The task is to print out the total of ones
        System.out.println("Number of negative numbers: " + numbers);

    }
}
