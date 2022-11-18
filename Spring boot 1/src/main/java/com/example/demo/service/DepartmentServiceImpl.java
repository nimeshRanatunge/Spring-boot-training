package com.example.demo.service;

import com.example.demo.entity.Department;
import com.example.demo.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImpl implements DepartmentService{

//    particular object will attached to this particular reference
    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return departmentRepository.findAll();
    }

    @Override
    public Department fetchDepartmentById(Long departmentId) {
        //get value by adding get()
        return departmentRepository.findById(departmentId).get();
    }

    @Override
    public void deleteDepartmentById(Long departmentId) {
        departmentRepository.deleteAllById(Collections.singleton(departmentId));
    }

    @Override
    public Department updateDepartment(Long departmentId, Department department) {
        //check not null or not blank
        Department depDB = departmentRepository.findById(departmentId).get();
        if(Objects.nonNull(department.getDepName()) && !"".equalsIgnoreCase(department.getDepName())){
            depDB.setDepName(department.getDepName());
        };
        if(Objects.nonNull(department.getDepCode()) && !"".equalsIgnoreCase(department.getDepCode())){
            depDB.setDepCode(department.getDepCode());
        };
        if(Objects.nonNull(department.getDepAddress()) && !"".equalsIgnoreCase(department.getDepAddress())){
            depDB.setDepAddress(department.getDepAddress());
        };
        return departmentRepository.save(department);
    }
}

//validate requests by hibernate
