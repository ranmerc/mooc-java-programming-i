
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> bookList = new ArrayList<>();

        while (true) {
            System.out.println("Title:");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.println("Pages:");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.println("Publication year:");
            int publicationYear = Integer.valueOf(scanner.nextLine());

            Book bookObject = new Book(title, pages, publicationYear);

            bookList.add(bookObject);
        }

        System.out.println("What information will be printed?");
        String choice = scanner.nextLine();

        if (choice.equals("everything")) {
            for (Book bookObject : bookList) {
                System.out.println(bookObject);
            }
        } else if (choice.equals("name")) {
            for (Book bookObject : bookList) {
                System.out.println(bookObject.getTitle());
            }
        }
    }
}
