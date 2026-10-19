package com.pluralsight.workbook2a.arrays;

public class ArraysDemo {

    public static void main(String[] args) {
        // Workbook 2a p. 69: an array with initial values; positions start at 0
        int[] nums = {63, 65, 60, 53, 58, 37, 35, 31};
        // TODO: print every element of nums, using its index
        System.out.println();

        // p. 70: a fixed size with no values gets default values
        int[] nums2 = new int[5];
        for (int i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println();

        String[] words = new String[5];
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
        System.out.println();
    }
}
