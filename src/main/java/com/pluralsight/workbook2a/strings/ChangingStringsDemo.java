package com.pluralsight.workbook2a.strings;

public class ChangingStringsDemo {

    public static void main(String[] args) {
        // Workbook 2a p. 9: length
        String fullName = "Dana Wyatt";
        int length = fullName.length();
        System.out.println(length);

        // p. 9: trim
        String username = " danaw    ";
        // TODO: trim the spaces off username
        System.out.println("[" + username + "]");

        // p. 9: toUpperCase
        username = username.toUpperCase();
        System.out.println(username);

        // p. 10: chain the calls
        username = " danaw    ";
        username = username.trim().toUpperCase();
        System.out.println(username);

        // p. 10: toLowerCase
        String state = "New Mexico";
        state = state.toLowerCase();
        System.out.println(state);
    }
}
