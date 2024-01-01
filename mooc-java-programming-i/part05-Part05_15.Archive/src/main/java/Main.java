
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> books = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            Archive book = new Archive(identifier, name);
            if(!books.contains(book)) {
                books.add(book);
            }

        }


        // NB! Don't alter the line below!
        System.out.println("==Items==");
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }



    }
}
