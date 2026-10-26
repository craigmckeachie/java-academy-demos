package com.pluralsight.workbook3a.readingfiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLoopDemo {

    public static void main(String[] args) {
        // Workbook 3a pp. 13-14: read every line until readLine() returns null
        try {
            // create a FileReader connected to the file
            FileReader fileReader = new FileReader("poem.txt");
            // create a BufferedReader to manage the input stream
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // read the first line
            String line = bufferedReader.readLine();

            // TODO: keep printing and reading the next line while line is not null

            // close the reader to release the file
            bufferedReader.close();
        } catch (IOException e) {
            // print the details so the error is never hidden from you
            e.printStackTrace();
        }
    }
}
