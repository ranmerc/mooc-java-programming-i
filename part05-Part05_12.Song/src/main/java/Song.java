
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }
    
    public boolean equals(Object compared) {
        // check if same reference
        if (this == compared) {
            return true;
        }
        
        // check if same type of object
        if (!(compared instanceof Song)) {
            return false;
        }
        
        // cast for comparison
        Song comparedSong = (Song) compared;
        
        if(comparedSong.name.equals(this.name) && comparedSong.artist.equals(this.artist) && comparedSong.durationInSeconds == this.durationInSeconds) {
            return true;
        }
        
        return false;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
