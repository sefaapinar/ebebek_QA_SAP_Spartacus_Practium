package BusinessLayer.Concrete;

import BusinessLayer.Abstract.EmployeeService;
import EntityLayer.Concrete.Employee;

import java.time.LocalDate;

public class EmployeeManager implements EmployeeService {

    Employee employee;

    public EmployeeManager(Employee employee){
        this.employee = employee;
    }

    @Override
    public void tax(double employeeSalary) {
        employee.setEmployeeSalary(employeeSalary - (employeeSalary * 0.03));
    }

    @Override
    public void bonus(int employeeWorkHour, double employeeSalary) {
        if(employeeWorkHour > 40){
            for (int j = 0; j < employeeWorkHour; ++j){
                employeeSalary += 30;
            }
            employee.setEmployeeSalary(employeeSalary);
        }
    }


    @Override
    public void raiseSalary(double employeeSalary, LocalDate employeeHireYear) {

        if(2021 - employeeHireYear.getYear() < 10){
            employee.setEmployeeSalary(employeeSalary + employeeSalary * 0.05);
        } else if (2021 - employeeHireYear.getYear() > 9 && 2021 - employeeHireYear.getYear() < 20) {
            employee.setEmployeeSalary(employeeSalary + employeeSalary * 0.10);
        }else{
            employee.setEmployeeSalary(employeeSalary);
        }
    }
}
