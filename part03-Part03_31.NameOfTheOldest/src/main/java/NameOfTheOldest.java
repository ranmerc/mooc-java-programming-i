
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxAge = 0;
        String oldestName = "";
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }
            
            String[] fields = input.split(",");
            
            int age = Integer.valueOf(fields[1]);
            if (age > maxAge) {
                maxAge = age;
                oldestName = fields[0];
            }
        }
        
        System.out.println("Name of the oldest: " + oldestName);
    }
}
