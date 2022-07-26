
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        int numberCount = 0;
        try (Scanner fileScan = new Scanner(Paths.get(file))) {
            while(fileScan.hasNextLine()) {
                int number = Integer.valueOf(fileScan.nextLine());
                
                if (number <= upperBound && number >= lowerBound) {
                    numberCount++;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Numbers: " + numberCount);
    }

}
