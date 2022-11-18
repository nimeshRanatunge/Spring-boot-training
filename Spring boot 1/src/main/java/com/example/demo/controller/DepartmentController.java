package com.example.demo.controller;
import com.example.demo.entity.Department;
import com.example.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
//place we are getting data/ request body

@RestController
public class DepartmentController {

    //what ever data you getting as req body convert it to department object

    @Autowired
    private DepartmentService departmentService;
//    autowire constructor bases/gettersetter based/property based
    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department) {
        //passing req body, json object->convert json object to department entity(java object)
        return departmentService.saveDepartment(department);
    }
    //whenever the request is coming, to save the data from post mapping, that particular request(json body) coming as request body
    //will be validated against the annotation that we have defined (@NotBlank in department.java)

    //no inputs,we want to send all data back
    @GetMapping("/departments")
    public List<Department> fetchDepartmentList(){
        return departmentService.fetchDepartmentList();
    }

    //path variable have here
    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId){
        return departmentService.fetchDepartmentById(departmentId);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
        departmentService.deleteDepartmentById(departmentId);
        return "department Deleted Successfully";
    }

    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId,@RequestBody Department department){
        return departmentService.updateDepartment(departmentId, department);
    }
}
