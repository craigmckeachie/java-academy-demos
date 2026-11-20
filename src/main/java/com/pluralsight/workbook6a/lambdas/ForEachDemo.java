package com.pluralsight.workbook6a.lambdas;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class ForEachDemo {

    public static void main(String[] args) {
        // Workbook 6a p. 70
        List<String> names = new ArrayList<>();
        names.add("Ezra");
        names.add("Ian");
        names.add("Siddalee");

        // TODO: replace this loop with names.forEach(...)
        for (String name : names) {
            System.out.println(name);
        }

        // Workbook 6a p. 71
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ezra", "Actor", new BigDecimal("72750.00")));
        employees.add(new Employee("Ian", "Banker", new BigDecimal("252750.00")));
        employees.add(new Employee("Siddalee", "Model", new BigDecimal("1500000.00")));
        employees.add(new Employee("Elisha", "Programmer", new BigDecimal("103500.00")));
        employees.add(new Employee("Pursalane", "Teacher", new BigDecimal("697250.00")));
        employees.add(new Employee("Zephaniah", "Engineer", new BigDecimal("136000.00")));

        // TODO: with employees.forEach(...), give everyone a 10% raise and print what they earn
    }
}
