
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        try (Scanner scanner2 = new Scanner(Paths.get(file))) {

            // we read the file until all lines have been read
            while (scanner2.hasNextLine()) {
                // we read one line
                String row = scanner2.nextLine();
                String[] parts = row.split(",");
                // we print the line that we read
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);
                System.out.println(name + ", age: " + age + " years:");

                // we print the line that we read

            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }


    }
}
