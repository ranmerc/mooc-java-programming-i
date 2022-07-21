
/**
 *
 * @author ranmerc
 */
public class Song {
    private String name;
    private int seconds;
    
    public Song(String name, int length) {
        this.name = name;
        this.seconds = length;
    }
    
    public String name() {
        return this.name;
    }
    
    public int length() {
        return this.seconds;
    }
}
