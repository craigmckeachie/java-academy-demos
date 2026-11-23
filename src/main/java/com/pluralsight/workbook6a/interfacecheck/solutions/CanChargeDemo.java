package com.pluralsight.workbook6a.interfacecheck.solutions;

import java.util.ArrayList;
import java.util.List;

public class CanChargeDemo {

    public static void main(String[] args) {
        // Workbook 6a p. 32, with Monday's flying things
        List<Flyable> flyingThings = new ArrayList<>();
        flyingThings.add(new Bird());
        flyingThings.add(new Airplane());
        flyingThings.add(new Drone());

        for (Flyable thing : flyingThings) {
            thing.fly();
            if (thing instanceof Rechargeable rechargeable) {
                rechargeable.charge();
            }
        }
    }
}
