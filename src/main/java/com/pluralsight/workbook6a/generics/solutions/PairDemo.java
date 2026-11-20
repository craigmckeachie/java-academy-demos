package com.pluralsight.workbook6a.generics.solutions;

public class PairDemo {

    public static void main(String[] args) {
        // Workbook 6a p. 45: works for ints only
        IntegerPair numbers = new IntegerPair(63, 65);
        numbers.swap();
        System.out.println(numbers.getLeftNumber() + " - " + numbers.getRightNumber());

        // Workbook 6a p. 50: one class, any type
        Pair<Integer> twoNums = new Pair<>(63, 65);
        twoNums.swap();
        System.out.println(twoNums.getLeftThing() + " - " + twoNums.getRightThing());

        Pair<String> twoWords = new Pair<>("Me", "You");
        twoWords.swap();
        System.out.println(twoWords.getLeftThing() + " - " + twoWords.getRightThing());
    }
}
