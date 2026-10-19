package com.pluralsight.workbook2a.arrays.solutions;

public class PassingArrayDemo {

    public static void main(String[] args) {
        // Workbook 2a p. 73 (the workbook names this class Program)
        int[] nums = {63, 65, 60, 53, 58, 37, 35, 31};
        displayNumbers(nums);
    }

    // no size in the parameter: any int array can be passed in
    public static void displayNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
