package Week7;


public class SportsStatistics {
    public static void main(String[] args) {
        FootballStats footballPlayer = new FootballStats("Lionel Messi", 10, 30, 15);
        footballPlayer.displayFootballStats();

        CricketStats cricketPlayer = new CricketStats("Virat Kohli", 18, 1200, 20);
        cricketPlayer.displayCricketStats();
    }
}

class FootballStats {
    private String playerName;
    private int playerNumber;
    private int goalsScored;
    private int assists;

    public FootballStats(String playerName, int playerNumber, int goalsScored, int assists) {
        this.playerName = playerName;
        this.playerNumber = playerNumber;
        this.goalsScored = goalsScored;
        this.assists = assists;
    }

    public void displayFootballStats() {
        System.out.println("Football player: " + playerName + ", Number: " + playerNumber +
                ", Goals Scored: " + goalsScored + ", Assists: " + assists);
    }
}

// Class to keep track of cricket player statistics
class CricketStats {
    private String playerName;
    private int playerNumber;
    private int runsScored;
    private int wicketsTaken;

    public CricketStats(String playerName, int playerNumber, int runsScored, int wicketsTaken) {
        this.playerName = playerName;
        this.playerNumber = playerNumber;
        this.runsScored = runsScored;
        this.wicketsTaken = wicketsTaken;
    }

    public void displayCricketStats() {
        System.out.println("Cricket player: " + playerName + ", Number: " + playerNumber +
                ", Runs Scored: " + runsScored + ", Wickets Taken: " + wicketsTaken);
    }
}

