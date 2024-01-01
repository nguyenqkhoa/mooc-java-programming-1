
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        while(true) {
            String text = scanner.nextLine();

            if (text.equals("")){
                break;
            }
            String[] pieces = text.split(",");
            int temp = Integer.valueOf(pieces[1]);
            if (oldest < temp){
                oldest = temp;
            }
        }
        System.out.println("Age of the oldest: " + oldest);



    }
}
