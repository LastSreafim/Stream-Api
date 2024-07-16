package com.sreams_homework.learning_Streams_Api.Controller;

import com.sreams_homework.learning_Streams_Api.Employee.Employee;
import com.sreams_homework.learning_Streams_Api.Service.DepartmentService;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    private final DepartmentService employeeService;

    public DepartmentController(DepartmentService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/min-salary")
    public Employee minSalaryDepartment(@RequestParam("department") int department) {
        return employeeService.minSalary(department);
    }

    @GetMapping("/max-salary")
    public Employee maxSalaryDepartment(@RequestParam("department") int department) {
        return employeeService.maxSalary(department);
    }

    @GetMapping(value = "/all", params = "department")
    public Collection<Employee> employeesDepartment(@RequestParam("department") int department) {
        return employeeService.employeesDepartment(department);
    }

    @GetMapping("/all")
    public Map<Integer, List<Employee>> allEmployeesDepartments() {
        return employeeService.allEmployeesDepartments();
    }
}

