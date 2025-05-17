package net.suryavardhan.employeepayrollapp.repository;

import net.suryavardhan.employeepayrollapp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
