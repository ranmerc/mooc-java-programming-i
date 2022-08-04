import java.util.Scanner;

public class UserInterface {

    private PointList pointList;
    private Scanner scanner;
    
    public UserInterface(Scanner scanner) {
        this.pointList = new PointList();
        this.scanner = scanner;
    }
    
    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        userInput();
        
        System.out.println("Point average (all): " + this.pointList.pointAverageAll());
        
        System.out.print("Point average (passing): ");
        if (this.pointList.pointAveragePassing() == -1) {
            System.out.println("-");
        } else {
         System.out.println(this.pointList.pointAveragePassing());   
        }
        
        System.out.println("Pass percentage: " + this.pointList.passPercentage());
        
        System.out.println("Grade distribution:");
        for (int i = 5; i >= 0; i--) {
            System.out.println(i + ": " + this.getStars(this.pointList.pointsWithGrade(i)));
        } 
    }
    
    public String getStars(int number) {
        String stars = "";
        
        for (int i = 0; i < number; i++) {
            stars += "*";
        }
        
        return stars;
    }
    
    public void userInput() {
        while (true) {
            int value = Integer.valueOf(this.scanner.nextLine());
            
            if (value == -1) {
                break;
            }
            
            this.pointList.addPoint(value);
        }
    }
}
