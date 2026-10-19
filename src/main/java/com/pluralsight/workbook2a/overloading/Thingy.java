package com.pluralsight.workbook2a.overloading;

// Workbook 2a p. 51 (each method prints its signature so we can see which one runs)
public class Thingy {
    public void foo() {
        // signature  foo
        System.out.println("foo()");
    }

    public void foo(int x) {
        // signature  foo_int
        System.out.println("foo(int)");
    }

    public void foo(int x, int y) {
        // signature  foo_int_int
        System.out.println("foo(int, int)");
    }

    public void foo(int x, String s) {
        // signature  foo_int_String
        System.out.println("foo(int, String)");
    }

    public void foo(String s, int x) {
        // signature  foo_String_int
        System.out.println("foo(String, int)");
    }

    public void foo(String x) {
        // signature  foo_String
        System.out.println("foo(String)");
    }
}
