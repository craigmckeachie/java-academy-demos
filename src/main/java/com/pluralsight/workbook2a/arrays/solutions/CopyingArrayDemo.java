package com.pluralsight.workbook2a.arrays.solutions;

public class CopyingArrayDemo {

    public static void main(String[] args) {
        // Workbook 2a p. 76: assigning does NOT copy
        String[] colors = {"red", "white", "blue"};
        String[] copy = new String[3];
        copy = colors; // they **reference** the same underlying array

        // p. 76: copy colors to colorCopy 1 at a time (the workbook calls this class ArrayCopyDemo)
        String[] colorCopy = new String[3];
        for (int i = 0; i < 3; i++) {
            colorCopy[i] = colors[i];
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(colorCopy[i]);        // red, white, blue
        }

        // p. 77: copy from colors at subscript 0 to colorCopy2 at 0 -- move 3 elements
        String[] colorCopy2 = new String[3];
        System.arraycopy(colors, 0, colorCopy2, 0, 3);
        for (int i = 0; i < 3; i++) {
            System.out.println(colorCopy2[i]);       // red, white, blue
        }

        // p. 77: copy from colors at subscript 1 to colorCopy3 at 0 -- move 2 elements
        String[] colorCopy3 = new String[3];
        System.arraycopy(colors, 1, colorCopy3, 0, 2);
        for (int i = 0; i < 2; i++) {
            System.out.println(colorCopy3[i]);       // white, blue
        }
    }
}
