package com.kodilla.patterns2.adapter.company.newhrsystem;

import java.math.BigDecimal;

public class Employee {
    private final String peselId;
    private final String firstname;
    private final String lastname;
    private final BigDecimal baseSalary;

    public Employee(String peselId, String firstname, String lastname, BigDecimal baseSalary) {
        this.peselId = peselId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.baseSalary = baseSalary;
    }

    public String getPeselId() {
        return peselId;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public BigDecimal getBaseSalary() {
        return baseSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (!peselId.equals(employee.peselId)) return false;
        if (!firstname.equals(employee.firstname)) return false;
        if (!lastname.equals(employee.lastname)) return false;
        return baseSalary.equals(employee.baseSalary);
    }

    @Override
    public int hashCode() {
        int result = peselId.hashCode();
        result = 31 * result + firstname.hashCode();
        result = 31 * result + lastname.hashCode();
        result = 31 * result + baseSalary.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "peselId='" + peselId + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
