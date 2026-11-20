package com.pluralsight.workbook6a.workingwithinterfaces.solutions;

// Workbook 6a p. 28
public class EtchASketch implements Drawable, Cleaner {

    @Override
    public void draw() {
        System.out.println("Twist, twist: a staircase.");
    }

    @Override
    public void clean() {
        System.out.println("Shake the Etch A Sketch: the picture is gone.");
    }
}
