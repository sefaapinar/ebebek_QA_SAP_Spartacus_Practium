import BusinessLayer.Abstract.EmployeeService;
import BusinessLayer.Concrete.EmployeeManager;
import EntityLayer.Concrete.Employee;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Sefa Pinar",7.663,60,LocalDate.of(2022,12,1));
        System.out.println(employee);
        EmployeeManager employeeManager = new EmployeeManager(employee);
        employeeManager.tax(employee.getEmployeeSalary());
        employeeManager.bonus(employee.getEmployeeWorkHours(),employee.getEmployeeSalary());
        employeeManager.raiseSalary(employee.getEmployeeSalary(),employee.getEmployeeHireYear());

        System.out.println("Currently: " + employee);



    }
}