import java.util.ArrayList;

public class Stack {
    
    private ArrayList<String> stackList;

    public Stack() {
        this.stackList = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        return this.stackList.isEmpty();
    }
    
    public void add(String value) {
        this.stackList.add(value);
    }
    
    public ArrayList<String> values() {
        return this.stackList;
    }
    
    public String take() {
        return this.stackList.remove(this.stackList.size() - 1);
    }
}
