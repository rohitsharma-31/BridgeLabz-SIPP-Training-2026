import java.util.Scanner;

public class RockPaperScissors {
    public static String getComputerChoice() {
        int value = (int) (Math.random() * 3);
        switch (value) {
            case 0: return "rock";
            case 1: return "paper";
            default: return "scissors";
        }
    }

    public static String getWinner(String player, String computer) {
        if (player.equals(computer)) return "Draw";
        if (player.equals("rock") && computer.equals("scissors")) return "Player";
        if (player.equals("paper") && computer.equals("rock")) return "Player";
        if (player.equals("scissors") && computer.equals("paper")) return "Player";
        return "Computer";
    }

    public static String[][] buildStats(String[][] results) {
        int playerWins = 0;
        int computerWins = 0;
        int draws = 0;
        for (String[] row : results) {
            if (row[2].equals("Player")) playerWins++;
            else if (row[2].equals("Computer")) computerWins++;
            else draws++;
        }
        int total = results.length;
        double playerPct = total == 0 ? 0 : (playerWins * 100.0 / total);
        double computerPct = total == 0 ? 0 : (computerWins * 100.0 / total);

        String[][] stats = new String[3][2];
        stats[0][0] = "Player Wins";
        stats[0][1] = String.format("%d", playerWins);
        stats[1][0] = "Computer Wins";
        stats[1][1] = String.format("%d", computerWins);
        stats[2][0] = "Win Percentage";
        stats[2][1] = String.format("Player: %.2f%%, Computer: %.2f%%", playerPct, computerPct);
        return stats;
    }

    public static void displayGameResults(String[][] results, String[][] stats) {
        System.out.printf("%-10s %-10s %-10s%n", "Player", "Computer", "Winner");
        for (String[] row : results) {
            System.out.printf("%-10s %-10s %-10s%n", row[0], row[1], row[2]);
        }
        System.out.println();
        System.out.println("Summary:");
        for (String[] row : stats) {
            System.out.printf("%-15s %s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games = sc.nextInt();
        sc.nextLine();

        String[][] results = new String[games][3];
        for (int i = 0; i < games; i++) {
            System.out.print("Enter choice for game " + (i + 1) + " (rock/paper/scissors): ");
            String player = sc.nextLine().trim().toLowerCase();
            String computer = getComputerChoice();
            String winner = getWinner(player, computer);
            results[i][0] = player;
            results[i][1] = computer;
            results[i][2] = winner;
        }

        String[][] stats = buildStats(results);
        displayGameResults(results, stats);
        sc.close();
    }
}
