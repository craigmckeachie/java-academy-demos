package com.pluralsight.workbook3a.writingfiles;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteLoopDemo {

    public static void main(String[] args) {
        // Workbook 3a p. 22: write many lines with a loop
        try {
            FileWriter fileWriter = new FileWriter("counting.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // TODO: for count from 1 to 10, write "Counting 1", "Counting 2", ... one per line

            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("ERROR: An unexpected error occurred");
            e.printStackTrace();
        }
    }
}
