import java.util.ArrayList;


public class Suitcase {
    
    private int maxWeight;
    private ArrayList<Item> itemList;
    
    public Suitcase(int maxWeight) {
        this.itemList = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        
        for (Item item : this.itemList) {
            totalWeight += item.getWeight();
        }
        
        return totalWeight;
    }
    
    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() <= this.maxWeight) {
            itemList.add(item);
        }
    }
    
    public void printItems() {
        for (Item item : this.itemList) {
            System.out.println(item);
        }
    }
    
    public Item heaviestItem() {
        if (this.itemList.isEmpty()) {
            return null;
        }
        
        Item heaviestItem = this.itemList.get(0);
        
        for (Item item : this.itemList) {
            if (item.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = item;
            }
        }
        
        return heaviestItem;
    }
    
    public String toString() {
        if (this.itemList.isEmpty()) {
            return "no items (0 kg)";
        }
        
        String toPrint = "" + this.itemList.size();
        
        if (this.itemList.size() > 1) {
            toPrint += " items";
        } else  {
            toPrint += " item";
        }
        
        return  toPrint + " (" + this.totalWeight() + " kg)";
    }
}
