package com.pluralsight.workbook6a.workingwithinterfaces;

import java.util.ArrayList;

public class CleanEverythingDemo {

    public static void main(String[] args) {
        // Workbook 6a p. 32
        ArrayList<Object> things = new ArrayList<>();
        things.add(new Person("Dana"));
        things.add(new Robot());
        things.add(new EtchASketch());
        things.add(new RobotVacuum());

        for (Object thing : things) {
            // TODO: if this thing is a Cleaner, cast it and call clean()
        }
    }
}
