
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxNameLength = 0;
        String longestName = "";
        int sumOfYears = 0;
        int recordCount = 0;
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }
            
            String[] fields = input.split(",");
            
            int nameLength = fields[0].length();
            
            if (nameLength > maxNameLength) {
                maxNameLength = nameLength;
                longestName = fields[0];
            }
            
            int year = Integer.valueOf(fields[1]);
            
            sumOfYears += year;
            recordCount += 1;
        }
        
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + ((double) sumOfYears / recordCount));
    }
}
