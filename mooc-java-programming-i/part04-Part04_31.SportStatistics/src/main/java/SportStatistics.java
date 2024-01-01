
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        int gameCount = 0;
        int teamWins = 0;
        int teamLosses = 0;
        try (Scanner scanner2 = new Scanner(Paths.get(file))) {

            // we read the file until all lines have been read
            while (scanner2.hasNextLine()) {
                // we read one line
                String row = scanner2.nextLine();
                String[] parts = row.split(",");
                // we print the line that we read
                String team1 = parts[0];
                String team2 = parts[1];
                int score1 = Integer.valueOf((parts[2]));
                int score2 = Integer.valueOf((parts[3]));

                if(team1.equals(team) || team2.equals(team)){
                    gameCount++;
                    if(parts[0].equals(team) && score1 > score2){
                        teamWins++;
                    } else if (parts[1].equals(team) && score1 < score2){
                        teamWins++;
                    } else {
                        teamLosses++;
                    }

                }
                // we print the line that we read

            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }

        System.out.println("Games: " + gameCount);
        System.out.println("Wins: " + teamWins);
        System.out.println("Losses: " + teamLosses);


    }

}
