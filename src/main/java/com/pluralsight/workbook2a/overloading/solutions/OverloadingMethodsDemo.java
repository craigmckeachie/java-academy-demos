package com.pluralsight.workbook2a.overloading.solutions;

public class OverloadingMethodsDemo {

    public static void main(String[] args) {
        // Workbook 2a p. 52: the compiler picks the overload by looking at the arguments
        Thingy obj = new Thingy();
        obj.foo(7);
        obj.foo(7, "Xyz");
        obj.foo("Xyz", 7);
    }
}
