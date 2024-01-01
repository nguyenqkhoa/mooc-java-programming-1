
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = 0;
        String name = "";
        double average = 0.0;
        int count = 0;
        while(true) {
            String text = scanner.nextLine();

            if (text.equals("")){
                break;
            }
            String[] pieces = text.split(",");
            String tempWord = pieces[0];
            int temp = tempWord.length();
            if (length < temp){
                length = temp;
                name = pieces[0];
            }
            average += Integer.valueOf(pieces[1]);
            count++;
        }
        average = average / (double) count;
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + average);



    }
}
