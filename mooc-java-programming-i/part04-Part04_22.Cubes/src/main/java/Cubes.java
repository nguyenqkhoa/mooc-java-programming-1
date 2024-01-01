
import java.util.ArrayList;
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(true){
            System.out.println("First name: ");
            String text = scanner.nextLine();
            if(text.equals("end")){
                break;
            }
            int number = Integer.valueOf(text);

            list.add(number);
        }
        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            number = number * number * number;
            System.out.println(number);

        }

    }
}
