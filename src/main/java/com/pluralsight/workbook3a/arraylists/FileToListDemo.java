package com.pluralsight.workbook3a.arraylists;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileToListDemo {

    public static void main(String[] args) {
        // read people.csv (project root) into an ArrayList, one Person per line
        ArrayList<Person> people = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader("people.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();
            while (line != null) {
                // TODO: split the line on | into parts (Workbook 2a: split("\\|"))

                // TODO: turn the parts into a name and an age (Integer.parseInt)

                // TODO: create a Person and add it to the list

                line = bufferedReader.readLine();
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // the list now holds every person from the file
        System.out.println(people.size());
        for (Person currentPerson : people) {
            System.out.printf("%s is %d%n", currentPerson.getName(), currentPerson.getAge());
        }
    }
}
