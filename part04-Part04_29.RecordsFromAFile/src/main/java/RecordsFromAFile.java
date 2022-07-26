
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();

        try (Scanner fileScan = new Scanner(Paths.get(fileName))) {
            while (fileScan.hasNextLine()) {
                String line = fileScan.nextLine();

                String[] fields = line.split(",");
                String name = fields[0];
                int age = Integer.valueOf(fields[1]);

                System.out.print(name + ", age: " + age);

                if (age == 1) {
                    System.out.print(" year");
                } else {
                    System.out.print(" years");
                }

                System.out.println("");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
