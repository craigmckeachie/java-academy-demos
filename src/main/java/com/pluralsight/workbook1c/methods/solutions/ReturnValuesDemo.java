package com.pluralsight.workbook1c.methods.solutions;

public class ReturnValuesDemo {
    public static void main(String[] args) {
        printBanner();

        String player1 = "Nova";
        int coins1 = 120;
        int gems1 = 3;
        int score1 = calculateScore(coins1, gems1);
        printPlayer(player1, score1);

        String player2 = "Rex";
        int coins2 = 85;
        int gems2 = 7;
        int score2 = calculateScore(coins2, gems2);
        printPlayer(player2, score2);

        String player3 = "Pip";
        int coins3 = 40;
        int gems3 = 1;
        int score3 = calculateScore(coins3, gems3);
        printPlayer(player3, score3);
    }

    // void, no parameters -- just does a task
    public static void printBanner() {
        System.out.println("=========================");
        System.out.println("      GAME NIGHT");
        System.out.println("=========================");
    }

    // void, with parameters -- does a task using the inputs we hand it
    public static void printPlayer(String name, int score) {
        System.out.printf("%s score: %d %s%n", name, score, getRank(score));
    }

    // returns an int -- hands a value back to the caller
    public static int calculateScore(int coins, int gems) {
        int score = coins + gems * 50;
        return score;
    }

    // returns a String -- reviews if / else if / else too
    public static String getRank(int score) {
        if (score >= 400) {
            return "Gold";
        } else if (score >= 250) {
            return "Silver";
        } else {
            return "Bronze";
        }
    }
}
