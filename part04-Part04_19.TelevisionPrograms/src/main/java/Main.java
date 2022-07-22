import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Name:");
            String showName = scanner.nextLine();
            
            if (showName.isEmpty()) {
                break;
            }
            
            System.out.println("Duration:");
            int showDuration = Integer.valueOf(scanner.nextLine());
            
            TelevisionProgram show = new TelevisionProgram(showName, showDuration);
            
            programs.add(show);
        }
        
        System.out.println("Program's maximum duration?");
        int maxDuration = Integer.valueOf(scanner.nextLine());
        
        for (TelevisionProgram show: programs) {
            if (show.getDuration() <= maxDuration) {
                System.out.println(show);
            }
        }
    }
}
