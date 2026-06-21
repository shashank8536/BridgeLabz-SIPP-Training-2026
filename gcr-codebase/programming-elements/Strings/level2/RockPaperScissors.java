package Strings.level2;

import java.util.Scanner;

public class RockPaperScissors {
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);
        if (choice == 0) return "rock";
        if (choice == 1) return "paper";
        return "scissors";
    }

    public static String getWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";
        if ((user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("paper") && computer.equals("rock")) ||
            (user.equals("scissors") && computer.equals("paper"))) {
            return "User";
        }
        return "Computer";
    }

    public static String[][] calculateStats(int userWins, int compWins, int total) {
        String[][] stats = new String[2][3];
        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f%%", (userWins * 100.0) / total);
        
        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(compWins);
        stats[1][2] = String.format("%.2f%%", (compWins * 100.0) / total);
        
        return stats;
    }

    public static void displayGameResult(int game, String user, String comp, String winner) {
        System.out.printf("Game %d | User: %s | Comp: %s -> Winner: %s\n", game, user, comp, winner);
    }

    public static void displayStats(String[][] stats) {
        System.out.println("\nPlayer\t\tWins\tWin %");
        System.out.println("--------------------------------");
        for (int i = 0; i < stats.length; i++) {
            System.out.printf("%-15s %-7s %s\n", stats[i][0], stats[i][1], stats[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games to play: ");
        int games = sc.nextInt();
        
        int userWins = 0, compWins = 0;
        for (int i = 1; i <= games; i++) {
            System.out.print("\nGame " + i + " - Enter rock, paper, or scissors: ");
            String userChoice = sc.next().toLowerCase();
            String compChoice = getComputerChoice();
            String winner = getWinner(userChoice, compChoice);
            
            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;
            
            displayGameResult(i, userChoice, compChoice, winner);
        }
        
        String[][] stats = calculateStats(userWins, compWins, games);
        displayStats(stats);
        
        sc.close();
    }
}
