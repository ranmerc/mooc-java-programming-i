
import java.util.ArrayList;
import java.util.Random;

public class JokeManager {

    private ArrayList<String> jokeList;

    public JokeManager() {
        this.jokeList = new ArrayList<>();
    }

    public void addJoke(String joke) {
        this.jokeList.add(joke);
    }

    public String drawJoke() {
        if (this.jokeList.isEmpty()) {
            return "Jokes are in short supply.";
        }

        Random rand = new Random();
        int index = rand.nextInt(this.jokeList.size());
        return this.jokeList.get(index);
    }

    public void printJokes() {
        for (String joke : this.jokeList) {
            System.out.println(joke);
        }
    }
}
