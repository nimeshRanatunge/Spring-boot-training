package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

//this entity to connect with database using jpa
@Entity
public class Department {
//    department id as primary key
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;

    @NotBlank(message = "Please Add Department Name")
    private String depName;
    private String depAddress;
    private String depCode;

    public Department(Long departmentId, String depName, String depAddress, String depCode) {
        this.departmentId = departmentId;
        this.depName = depName;
        this.depAddress = depAddress;
        this.depCode = depCode;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", depName='" + depName + '\'' +
                ", depAddress='" + depAddress + '\'' +
                ", depCode='" + depCode + '\'' +
                '}';
    }

    //default constructor
    public Department() {
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getDepAddress() {
        return depAddress;
    }

    public void setDepAddress(String depAddress) {
        this.depAddress = depAddress;
    }

    public String getDepCode() {
        return depCode;
    }

    public void setDepCode(String depCode) {
        this.depCode = depCode;
    }
}
