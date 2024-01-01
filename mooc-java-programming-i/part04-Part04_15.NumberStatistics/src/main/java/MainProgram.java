
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        Statistics stats = new Statistics();
        Statistics evenStats = new Statistics();
        Statistics oddStats = new Statistics();
        System.out.println("Enter numbers: ");
        while(true) {
            int text = Integer.valueOf(scanner.nextLine());

            if (text == -1){
                break;
            }

            if (text % 2 ==0){
                evenStats.addNumber(text);
            } else{
                oddStats.addNumber(text);
            }

            stats.addNumber(text);

            }
        System.out.println("Sum: " + stats.sum());
        System.out.println("Sum of even numbers: " + evenStats.sum());
        System.out.println("Sum of odd numbers: " + oddStats.sum());

        }

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!

}
