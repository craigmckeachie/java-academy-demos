package com.pluralsight.workbook6a.lambdas;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FilterDemo {

    public static void main(String[] args) {
        // Workbook 6a pp. 63, 69 and 71
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ezra", "Actor", new BigDecimal("72750.00")));
        employees.add(new Employee("Ian", "Banker", new BigDecimal("252750.00")));
        employees.add(new Employee("Siddalee", "Model", new BigDecimal("1500000.00")));
        employees.add(new Employee("Elisha", "Programmer", new BigDecimal("103500.00")));
        employees.add(new Employee("Pursalane", "Teacher", new BigDecimal("697250.00")));
        employees.add(new Employee("Zephaniah", "Engineer", new BigDecimal("136000.00")));

        BigDecimal limit = new BigDecimal("150000");

        // the loop you already know
        List<Employee> bigEarners = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getSalary().compareTo(limit) > 0) {
                bigEarners.add(employee);
            }
        }

        System.out.println("With a loop:");
        for (Employee employee : bigEarners) {
            System.out.println(employee.getName());
        }

        // TODO: the same search, as a stream: stream(), filter(...), toList()
    }
}
