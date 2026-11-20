package com.pluralsight.workbook6a.lambdas.solutions;

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

        names.forEach(name -> System.out.println(name));

        // Workbook 6a p. 71
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ezra", "Actor", new BigDecimal("72750.00")));
        employees.add(new Employee("Ian", "Banker", new BigDecimal("252750.00")));
        employees.add(new Employee("Siddalee", "Model", new BigDecimal("1500000.00")));
        employees.add(new Employee("Elisha", "Programmer", new BigDecimal("103500.00")));
        employees.add(new Employee("Pursalane", "Teacher", new BigDecimal("697250.00")));
        employees.add(new Employee("Zephaniah", "Engineer", new BigDecimal("136000.00")));

        employees.forEach(employee -> {
            BigDecimal raised = employee.getSalary().multiply(new BigDecimal("1.10"))
                    .setScale(2, RoundingMode.HALF_UP);
            employee.setSalary(raised);
            System.out.println(employee.getName() + " earns $" + employee.getSalary());
        });
    }
}
