package com.pluralsight.workbook1c.methods.solutions;

public class VoidMethodsDemo {
    public static void main(String[] args) {
        printBanner();

        String player1 = "Nova";
        int coins1 = 120;
        int gems1 = 3;
        int score1 = coins1 + gems1 * 50;
        System.out.printf("%s score: %d%n", player1, score1);

        String player2 = "Rex";
        int coins2 = 85;
        int gems2 = 7;
        int score2 = coins2 + gems2 * 50;
        System.out.printf("%s score: %d%n", player2, score2);

        String player3 = "Pip";
        int coins3 = 40;
        int gems3 = 1;
        int score3 = coins3 + gems3 * 50;
        System.out.printf("%s score: %d%n", player3, score3);
    }

    // void, no parameters -- just does a task
    public static void printBanner() {
        System.out.println("=========================");
        System.out.println("      GAME NIGHT");
        System.out.println("=========================");
    }
}
