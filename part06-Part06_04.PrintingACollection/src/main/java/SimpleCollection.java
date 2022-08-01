
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }

        String printOut = "The collection " + this.name + " has " + this.elements.size();
        
        if (this.elements.size() > 1) {
            printOut += " elements:";
        } else {
            printOut += " element:";
        }
        

        printOut += "\n";

        for (int i = 0; i < this.elements.size(); i++) {
            printOut += elements.get(i);
            
            if (i != this.elements.size() - 1) {
                printOut += "\n";
            }
        }

        return printOut;
    }
}
