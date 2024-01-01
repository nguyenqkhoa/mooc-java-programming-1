
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();

        // Write here the code for reading from file
        // and printing the read records
        try (Scanner scanner2 = new Scanner(Paths.get(file))) {

            // we read the file until all lines have been read
            while (scanner2.hasNextLine()) {
                // we read one line
                String row = scanner2.nextLine();
                String[] parts = row.split(",");
                // we print the line that we read
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);
                persons.add(new Person(name, age));

                // we print the line that we read

            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        return persons;

    }
}
