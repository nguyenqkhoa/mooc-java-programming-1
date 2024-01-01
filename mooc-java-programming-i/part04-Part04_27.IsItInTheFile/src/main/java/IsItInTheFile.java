
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        boolean found = false;
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        try (Scanner scanner2 = new Scanner(Paths.get(file))) {

            // we read the file until all lines have been read
            while (scanner2.hasNextLine()) {
                // we read one line
                String row = scanner2.nextLine();
                // we print the line that we read
                list.add(row);
                // we print the line that we read

            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(searchedFor)){
                found = true;
            }

        }
        if(found){
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        }

    }
}
