
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double numberOfPositiveNumbers = 0;
        double sum = 0;
        
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            }
            
            if (number > 0) {
                numberOfPositiveNumbers = numberOfPositiveNumbers + 1;
                sum = sum + number;
            }
        }
        
        if (numberOfPositiveNumbers > 0) {
            double average = sum / numberOfPositiveNumbers;
            System.out.println("Average of the numbers: " + average);
        }
        
        if(numberOfPositiveNumbers == 0) {
            System.out.println("Cannot calculate the average");
        }
    }
}
