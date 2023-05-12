package com.example.departmentservice23.rep;

import com.example.departmentservice23.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRep extends JpaRepository<Department, Long> {
    Department findByDepartmentId(Long departmentId);
}
