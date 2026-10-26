package com.pluralsight.workbook3a.readingfiles.solutions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileDemo {

    public static void main(String[] args) {
        // Workbook 3a pp. 12-14: poem.txt sits in the project root, next to pom.xml
        try {
            // create a FileReader connected to the file
            FileReader fileReader = new FileReader("poem.txt");
            // create a BufferedReader to manage the input stream
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // read one line and print it
            String line = bufferedReader.readLine();
            System.out.println(line);

            // close the reader to release the file
            bufferedReader.close();
        } catch (IOException e) {
            // print the details so the error is never hidden from you
            e.printStackTrace();
        }
    }
}
