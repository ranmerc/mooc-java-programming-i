public class Item {
    
    private String identifier;
    private String name;

    public Item(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }
    
    public boolean equals(Object compared) {
        if (compared == this) {
            return true;
        }
        
        if (!(compared instanceof Item)) {
            return false;
        }
        
        Item comparedItem = (Item) compared;
        
        if (comparedItem.identifier.equals(this.identifier)) {
            return true;
        }
        
        return false;
    }

    @Override
    public String toString() {
        return this.identifier + ": " + this.name;
    }
}
