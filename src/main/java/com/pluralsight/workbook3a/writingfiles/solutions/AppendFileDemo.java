package com.pluralsight.workbook3a.writingfiles.solutions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppendFileDemo {

    public static void main(String[] args) {
        // Workbook 3a p. 21: passing true adds to the end of the file instead of replacing it
        try {
            // true means append: add to the end of the file instead of replacing it
            FileWriter fileWriter = new FileWriter("text.txt", true);
            // create a BufferedWriter to write to it
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // write three lines; \n ends each line
            bufferedWriter.write("line 1 is here\n");
            bufferedWriter.write("line 2 is here\n");
            bufferedWriter.write("line 3 is here\n");

            // close the writer so everything is saved to the file
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("ERROR: An unexpected error occurred");
            // print the details so the error is never hidden from you
            e.printStackTrace();
        }
    }
}
