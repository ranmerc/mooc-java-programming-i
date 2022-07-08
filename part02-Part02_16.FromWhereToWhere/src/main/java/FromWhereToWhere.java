
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        int toNum = Integer.valueOf(scanner.nextLine());
        
//        for (int i = 1; i <= toNum; i++) {
//            System.out.println(i);
//        }
        
        System.out.println("Where from?");
        int fromNum = Integer.valueOf(scanner.nextLine());
        
        if (toNum >= fromNum) {
            for (int i = fromNum; i <= toNum; i++) {
                System.out.println(i);
            }
        }
    }
}
