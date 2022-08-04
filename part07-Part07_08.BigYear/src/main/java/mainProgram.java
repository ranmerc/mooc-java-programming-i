
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        BirdDatabase bdb = new BirdDatabase();
        
        while (true) {
            System.out.println("?");
            String command = scan.nextLine();
            
            if (command.equals("All")) {
                System.out.println(bdb);
            }
            
            if (command.equals("Add")) {
                System.out.println("Name:");
                String name = scan.nextLine();
                
                System.out.println("Latin Name:");
                String latinName = scan.nextLine();
                
                bdb.addBird(name, latinName);
            }
            
            if (command.equals("Observation")) {
                System.out.println("Bird?");
                String birdName = scan.nextLine();
                bdb.observe(birdName);
            }
            
            if (command.equals("One")) {
                System.out.println("Bird?");
                String birdName = scan.nextLine();
                bdb.findOne(birdName);
            }
            
            if (command.equals("Quit")) {
                break;
            }
        }
    }

}
