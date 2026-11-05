package com.pluralsight.workbook4a.statics;

public class MathUtilityDemo {

    public static void main(String[] args) {
        // Workbook 4a p. 81: Math is a utility class, so we never write new Math()
        double num1 = Math.pow(5, 2);
        double num2 = Math.sqrt(25);
        double num3 = Math.floor(12.8);
        double num4 = Math.round(12.8);

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);

        // area of a circle
        double radius = 5;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println(area);
    }
}
