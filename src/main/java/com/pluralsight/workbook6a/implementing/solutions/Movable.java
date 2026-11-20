package com.pluralsight.workbook6a.implementing.solutions;

// Workbook 6a pp. 23 and 27
public interface Movable {
    Point move(int xUnits, int yUnits);

    void goHome();
}
