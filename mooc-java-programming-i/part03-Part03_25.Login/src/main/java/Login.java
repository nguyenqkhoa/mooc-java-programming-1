
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        String alex = "alex";
        String emma = "emma";
        String passwordOne = "sunshine";
        String passwordTwo = "haskell";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        String userName = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        if((userName.equals(alex) && password.equals(passwordOne)) || (userName.equals(emma) && password.equals(passwordTwo))){
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }

    }
}
