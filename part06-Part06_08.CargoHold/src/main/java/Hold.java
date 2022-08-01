import java.util.ArrayList;

public class Hold {
    
    private int maxWeight;
    private ArrayList<Suitcase> suitcaseList;
            
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcaseList = new ArrayList<>();
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        
        for (Suitcase suitcase : this.suitcaseList) {
            totalWeight += suitcase.totalWeight();
        }
        
        return totalWeight;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() <= this.maxWeight) {
            this.suitcaseList.add(suitcase);
        }
    }
    
    public String toString() {
        return this.suitcaseList.size() + " suitcases (" + this.totalWeight() + " kg)";
    }
    
    public void printItems() {
        for (Suitcase suitcase : this.suitcaseList) {
            suitcase.printItems();
        }
    }
}
