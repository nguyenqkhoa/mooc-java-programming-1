
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int squared = Integer.valueOf(scanner.nextLine());
        squared = squared * squared;
        System.out.println(squared);

    }
}
