package com.pluralsight.workbook2a.strings;

public class SplitDemo {

    public static void main(String[] args) {
        String rawEmail = "   Gamer_42@Arcade.NET  ";
        String savedEmail = "gamer_42@arcade.net";

        // Slice A: clean it up and compare
        System.out.println("Raw: \"" + rawEmail + "\" has " + rawEmail.length() + " characters");

        String email = rawEmail.trim().toLowerCase();
        System.out.println("Clean: \"" + email + "\" has " + email.length() + " characters");

        System.out.println("Matches saved email? " + email.equals(savedEmail));
        System.out.println("Matches ignoring case? " + rawEmail.trim().equalsIgnoreCase(savedEmail));

        // Slice B: find the @ and cut the email into pieces
        int atPosition = email.indexOf("@");
        String username = email.substring(0, atPosition);
        String domain = email.substring(atPosition + 1);

        System.out.println("@ is at position: " + atPosition);
        System.out.println("Username: " + username);
        System.out.println("Domain: " + domain);
        System.out.println("First character: " + email.charAt(0));
        System.out.println("Is it a .net address? " + email.endsWith(".net"));

        // Slice C: split a list of emails
        String mailingList = "gamer_42@arcade.net;pixel.pro@retro.org;speedrun@fast.io";
    }
}
