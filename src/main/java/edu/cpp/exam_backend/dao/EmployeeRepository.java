package edu.cpp.exam_backend.dao;

import edu.cpp.exam_backend.entity.employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


@CrossOrigin(origins = "http://localhost:4200")
public interface EmployeeRepository extends JpaRepository<employee, Long> {
    Page<employee> findByDepartmentId(@RequestParam("id") Long id, Pageable pageable);
}
