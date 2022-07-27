
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String fileName = scan.nextLine();

        System.out.println("Team:");
        String teamName = scan.nextLine();

        int gameCount = 0;
        int winCount = 0;
        int lossCount = 0;

        try (Scanner fileScan = new Scanner(Paths.get(fileName))) {
            while (fileScan.hasNextLine()) {
                String line = fileScan.nextLine();

                String[] fields = line.split(",");
                String homeTeamName = fields[0];
                String visitingTeamName = fields[1];
                int homeTeamPoints = Integer.valueOf(fields[2]);
                int visitingTeamPoints = Integer.valueOf(fields[3]);

                if (homeTeamName.equals(teamName)) {
                    gameCount++;
                    if (homeTeamPoints > visitingTeamPoints) {
                        winCount++;
                    } else {
                        lossCount++;
                    }
                } else if (visitingTeamName.equals(teamName)) {
                    gameCount++;
                    if (homeTeamPoints < visitingTeamPoints) {
                        winCount++;
                    } else {
                        lossCount++;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Games: " + gameCount);
        System.out.println("Wins: " + winCount);
        System.out.println("Losses: " + lossCount);
    }

}
