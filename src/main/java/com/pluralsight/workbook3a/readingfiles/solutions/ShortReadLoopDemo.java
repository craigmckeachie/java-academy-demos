package com.pluralsight.workbook3a.readingfiles.solutions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ShortReadLoopDemo {

    public static void main(String[] args) {
        // Workbook 3a pp. 13-14: the same loop, written the way the workbook writes it
        try {
            FileReader fileReader = new FileReader("poem.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // read a line into line, then check it isn't null, all in one step
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
