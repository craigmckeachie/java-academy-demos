package com.pluralsight.workbook2a.arrays.solutions;

public class CopyingArrayDemo {

    public static void main(String[] args) {
        // Workbook 2a p. 76: assigning does NOT copy
        String[] colors = {"red", "white", "blue"};
        String[] copy = new String[3];
        copy = colors; // they **reference** the same underlying array

        // p. 76: copy colors to colorCopy one at a time (the workbook calls this class ArrayCopyDemo)
        String[] colorCopy = new String[3];
        for (int index = 0; index < colors.length; index = index + 1) {
            colorCopy[index] = colors[index];
        }
        for (String color : colorCopy) {
            System.out.println(color);               // red, white, blue
        }

        // p. 77: copy from colors at index 0 to colorCopy2 at 0 -- move 3 elements
        String[] colorCopy2 = new String[3];
        System.arraycopy(colors, 0, colorCopy2, 0, 3);
        for (String color : colorCopy2) {
            System.out.println(color);               // red, white, blue
        }

        // p. 77: copy from colors at index 1 to colorCopy3 at 0 -- move 2 elements
        String[] colorCopy3 = new String[2];
        System.arraycopy(colors, 1, colorCopy3, 0, 2);
        for (String color : colorCopy3) {
            System.out.println(color);               // white, blue
        }
    }
}
