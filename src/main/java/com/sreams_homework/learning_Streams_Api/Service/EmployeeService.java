package com.sreams_homework.learning_Streams_Api.Service;

import com.sreams_homework.learning_Streams_Api.Employee.Employee;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public interface EmployeeService {
    Employee addEmployee(String lastName, String firstName, int department, double salary);

    Employee removeEmployee(String lastName, String firstName);

    Employee findEmployee(String lastName, String firstName);

    Collection<Employee> getEmployees();
}