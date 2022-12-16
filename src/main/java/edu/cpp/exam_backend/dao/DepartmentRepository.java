package edu.cpp.exam_backend.dao;

import edu.cpp.exam_backend.entity.department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "department", path = "departments")
public interface DepartmentRepository extends JpaRepository<department, Long>{
}
