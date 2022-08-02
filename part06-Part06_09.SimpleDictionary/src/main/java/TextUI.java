
import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = this.scanner.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            
            if (command.equals("add")) {
                System.out.println("Word:");
                String word = this.scanner.nextLine();
                
                System.out.println("Translation:");
                String translation = this.scanner.nextLine();
                
                this.dictionary.add(word, translation);
                
                continue;
            }
            
            if (command.equals("search")) {
                System.out.println("To be translated:");
                String toBeTranslated = this.scanner.nextLine();
                
                String translation = this.dictionary.translate(toBeTranslated);
                
                if (translation == null) {
                    System.out.println("Word " + toBeTranslated + " was not found");
                    continue;
                }
                
                System.out.println("Translation" + translation);
                
                continue;
            }

            System.out.println("Unknown Command");
        }
    }
}
