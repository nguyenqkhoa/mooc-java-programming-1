import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Books> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Title: ");
            String title = scanner.nextLine();
            if(title.isEmpty()){
                break;
            }
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year: ");
            int publicationYear = Integer.valueOf(scanner.nextLine());

            books.add(new Books(title, pages, publicationYear));
        }

        System.out.println("What information will be printed? ");
        String information = scanner.nextLine();
        for(Books book: books){
            if (information.equals("everything")) {
                System.out.println(book);
            } else if (information.equals("name")){
                System.out.println(book.getTitle());
            } else if (information.equals("pages")){
                System.out.println(book.getPages());
            } else if (information.equals("year")){
                System.out.println(book.getPublicationYear());
            }


        }

    }
}
