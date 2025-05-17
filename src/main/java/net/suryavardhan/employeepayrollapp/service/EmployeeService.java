package net.suryavardhan.employeepayrollapp.service;

import net.suryavardhan.employeepayrollapp.dto.EmployeeDTO;
import net.suryavardhan.employeepayrollapp.model.Employee;

import java.util.List;

public interface EmployeeService {
	Employee addEmployee(EmployeeDTO dto);
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Long id);
    Employee updateEmployee(Long id, EmployeeDTO dto);
    void deleteEmployee(Long id);
	

}
