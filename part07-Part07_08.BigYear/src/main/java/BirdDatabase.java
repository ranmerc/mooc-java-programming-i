import java.util.ArrayList;

public class BirdDatabase {

    private ArrayList<Bird> birdList;

    public BirdDatabase() {
        this.birdList = new ArrayList<>();
    }
    
    
    public void addBird(String name, String latinName) {
        Bird bird = new Bird(name, latinName);
        
        this.birdList.add(bird);
    }
    
    public void observe(String name) {
        for(Bird bird : this.birdList) {
            if (bird.getName().equals(name)) {
                bird.observe();
                return;
            }
        }
        
        System.out.println("Not a bird!");
    }
    
    public void findOne(String name) {
        for(Bird bird : this.birdList) {
            if (bird.getName().equals(name)) {
                System.out.println(bird);
                return;
            }
        }
        
        System.out.println("Not a bird!");
    }
    
    public String toString() {
        String toReturn = "";
        
        for(Bird bird : this.birdList) {
            toReturn += bird.toString() + "\n";
        }
        
        return toReturn;
    }
}
