package edu.cpp.exam_backend.dao;

import edu.cpp.exam_backend.entity.employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<employee, Long> {
}
