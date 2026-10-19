package com.pluralsight.workbook2a.arrays.solutions;

public class ReturningArrayDemo {

    public static void main(String[] args) {
        // Workbook 2a p. 74 (the workbook names this class Program)
        int[] nums = getNumbers();
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    // no size in the return type either
    public static int[] getNumbers() {
        int[] nums = {63, 65, 60, 53, 58, 37, 35, 31};
        return nums;
    }
}
