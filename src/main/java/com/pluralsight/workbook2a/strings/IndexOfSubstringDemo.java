package com.pluralsight.workbook2a.strings;

public class IndexOfSubstringDemo {

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

        // Slice C: split a list of emails
        String mailingList = "gamer_42@arcade.net;pixel.pro@retro.org;speedrun@fast.io";
    }
}
