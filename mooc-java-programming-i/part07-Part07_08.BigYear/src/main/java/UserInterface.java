import java.util.Scanner;

public class UserInterface {

    private Scanner scan;
    private BirdDatabase birdDatabase;

    public UserInterface(Scanner scan, BirdDatabase birdDatabase){
        this.scan = scan;
        this.birdDatabase = birdDatabase;
    }

    public void start(){
        while(true){
            System.out.print("? ");
            String command = scan.nextLine();
            if (command.equals("Quit")) {
                break;
            } else if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                String nameInLatin = scan.nextLine();
                add(name, nameInLatin);
            } else if (command.equals("Observation")) {
                observation();
            } else if (command.equals("One")) {
                printOne();
            } else if (command.equals("All")) {
                printAll();
            }
        }
    }

    public void add(String name, String nameInLatin) {
        birdDatabase.add(name, nameInLatin);
    }

    public void observation() {
        System.out.print("Bird? ");
        String name = scan.nextLine();
        boolean wasSuccessful = birdDatabase.observation(name);
        if (!wasSuccessful) {
            System.out.println(name + "is not a bird!");
        }
    }

    public void printOne() {
        System.out.print("Bird? ");
        String name = scan.nextLine();
        String birdToPrint = birdDatabase.getOne(name);
        if (birdToPrint == null) {
            System.out.println(name + " is not a bird!");
        } else {
            System.out.println(birdToPrint);
        }
    }

    public void printAll() {
        System.out.print(birdDatabase.getAll());
    }
}
