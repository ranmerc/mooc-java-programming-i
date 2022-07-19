
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
    }
    
    public static void removeLast(ArrayList<String> strings) {
        int listSize = strings.size();
        
        if (listSize == 0) {
            return;
        }
        
        strings.remove(listSize - 1);
    }
}
