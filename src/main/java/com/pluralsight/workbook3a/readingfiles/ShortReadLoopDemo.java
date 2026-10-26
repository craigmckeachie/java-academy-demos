package com.pluralsight.workbook3a.readingfiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ShortReadLoopDemo {

    public static void main(String[] args) {
        // Workbook 3a pp. 13-14: the same loop, written the way the workbook writes it
        try {
            FileReader fileReader = new FileReader("poem.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // TODO: rewrite this loop so the read happens inside the while condition
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
