import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary){
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    public void start(){
        while(true) {
            System.out.println("Command: ");
            String input = scanner.nextLine();

            if(input.equals("add")){
                System.out.println("Word: ");
                String word = scanner.nextLine();
                System.out.println("Translation: ");
                String translation = scanner.nextLine();
                simpleDictionary.add(word, translation);
            }
            if(input.equals("search")){
                System.out.println("To be translated: ");
                String search = scanner.nextLine();
                if(simpleDictionary.translate(search) == null){
                    System.out.println("Word " + search + " was not found");
                }
                else {
                    System.out.println(simpleDictionary.translate(search));
                }
            }
            if (input.equals("end")) {
                break;
            }

            System.out.println("Unknown command");
        }
        System.out.println("Bye bye!");
    }
}
