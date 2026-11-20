package com.pluralsight.workbook6a.streammethods.solutions;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReduceDemo {

    public static void main(String[] args) {
        // Workbook 6a p. 78
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

        // Workbook 6a p. 71's employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ezra", "Actor", new BigDecimal("72750.00")));
        employees.add(new Employee("Ian", "Banker", new BigDecimal("252750.00")));
        employees.add(new Employee("Siddalee", "Model", new BigDecimal("1500000.00")));
        employees.add(new Employee("Elisha", "Programmer", new BigDecimal("103500.00")));
        employees.add(new Employee("Pursalane", "Teacher", new BigDecimal("697250.00")));
        employees.add(new Employee("Zephaniah", "Engineer", new BigDecimal("136000.00")));

        int sum = numbers.stream()
                .reduce(0, (total, number) -> total + number);
        System.out.println("Sum: " + sum);

        BigDecimal payroll = employees.stream()
                .map(employee -> employee.getSalary())
                .reduce(BigDecimal.ZERO, (total, salary) -> total.add(salary));
        System.out.println("Payroll: $" + payroll);
    }
}
