package com.pluralsight.workbook3a.writingfiles.solutions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteLoopDemo {

    public static void main(String[] args) {
        // Workbook 3a p. 22: write many lines with a loop
        try {
            FileWriter fileWriter = new FileWriter("counting.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (int count = 1; count <= 10; count = count + 1) {
                // String.format builds the line; \n ends it
                String text = String.format("Counting %d\n", count);
                bufferedWriter.write(text);
            }

            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("ERROR: An unexpected error occurred");
            e.printStackTrace();
        }
    }
}
