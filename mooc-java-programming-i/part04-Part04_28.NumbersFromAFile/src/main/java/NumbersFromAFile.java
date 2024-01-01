
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int counter = 0;
        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        try (Scanner scanner2 = new Scanner(Paths.get(file))) {

            // we read the file until all lines have been read
            while (scanner2.hasNextLine()) {
                // we read one line
                int row = Integer.valueOf(scanner2.nextLine());
                // we print the line that we read
                list.add(row);
                // we print the line that we read

            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) >= lowerBound && list.get(i) <= upperBound) {
                counter++;
            }

        }

        System.out.println("Numbers: " + counter);

    }

}
