package EntityLayer.Concrete;

import EntityLayer.Abstract.Entity;

import java.time.LocalDate;

public class Employee implements Entity {

    private String employeeName;
    private Double employeeSalary;
    private int employeeWorkHours;
    private LocalDate employeeHireYear;

    public Employee(String employeeName, Double employeeSalary, int employeeWorkHours, LocalDate employeeHireYear) {
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
        this.employeeWorkHours = employeeWorkHours;
        this.employeeHireYear = employeeHireYear;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(Double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public int getEmployeeWorkHours() {
        return employeeWorkHours;
    }

    public void setEmployeeWorkHours(int employeeWorkHours) {
        this.employeeWorkHours = employeeWorkHours;
    }

    public LocalDate getEmployeeHireYear() {
        return employeeHireYear;
    }

    public void setEmployeeHireYear(LocalDate employeeHireYear) {
        this.employeeHireYear = employeeHireYear;
    }









}
