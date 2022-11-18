package com.example.demo.repository;

import com.example.demo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//wont creating concrete implementation class, we will extend jpa repo cz jpa gives more methods to interact our entities with databse


//pass entity and PK type
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}

//When start application , all objects created and add to spring container