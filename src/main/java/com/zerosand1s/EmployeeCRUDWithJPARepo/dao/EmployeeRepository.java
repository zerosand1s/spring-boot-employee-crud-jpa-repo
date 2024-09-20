package com.zerosand1s.EmployeeCRUDWithJPARepo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zerosand1s.EmployeeCRUDWithJPARepo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
