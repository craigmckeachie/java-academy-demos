package com.pluralsight.workbook6a.lambdas;

import java.math.BigDecimal;

// Workbook 6a p. 71
public class Employee {
    private String name;
    private String jobTitle;
    private BigDecimal salary;

    public Employee(String name, String jobTitle, BigDecimal salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
