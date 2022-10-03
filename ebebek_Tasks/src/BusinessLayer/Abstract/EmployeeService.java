package BusinessLayer.Abstract;

import java.time.LocalDate;

public interface EmployeeService {

    void tax(double employeeSalary);
    void bonus(int employeeWorkHour, double employeeSalary);
    void raiseSalary(double employeeSalary, LocalDate employeeHireYear);
}
