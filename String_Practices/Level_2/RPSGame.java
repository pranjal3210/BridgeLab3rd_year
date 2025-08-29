package String_Practices.Level_2;

import java.util.Scanner;

public class RPSGame {
    public static String computerChoice() {
        String[] options = {"rock", "paper", "scissors"};
        return options[(int)(Math.random() * 3)];
    }

    public static String findWinner(String user, String comp) {
        if (user.equals(comp)) return "Draw";
        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("paper") && comp.equals("rock")) ||
            (user.equals("scissors") && comp.equals("paper"))) {
            return "User";
        }
        return "Computer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many games? ");
        int n = sc.nextInt();

        int userWins = 0, compWins = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter rock/paper/scissors: ");
            String user = sc.next();
            String comp = computerChoice();
            String winner = findWinner(user, comp);

            System.out.println("Game " + i + ": User=" + user + " Computer=" + comp + " -> Winner=" + winner);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;
        }

        System.out.println("\nFinal Stats:");
        System.out.println("User Wins: " + userWins + " (" + (userWins * 100.0 / n) + "%)");
        System.out.println("Computer Wins: " + compWins + " (" + (compWins * 100.0 / n) + "%)");
    }
}
