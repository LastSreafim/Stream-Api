package com.sreams_homework.learning_Streams_Api.Controller;

import com.sreams_homework.learning_Streams_Api.Employee.Employee;
import com.sreams_homework.learning_Streams_Api.Service.DepartmentService;
import org.springframework.web.bind.annotation.*;


import java.util.Collection;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/department/")
public class DepartmentController {
    private final DepartmentService employeeService;

    public DepartmentController(DepartmentService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/{id}/salary/min")
    public Employee minSalaryDepartment(@PathVariable int id) {
        return employeeService.minSalary(id);
    }

    @GetMapping("/{id}/salary/max")
    public Employee maxSalaryDepartment(@PathVariable int id) {
        return employeeService.maxSalary(id);
    }

    @GetMapping("/{id}/salary/sum")
    public Double calculateAllSalaryByDepartment(@PathVariable int id) {
        return employeeService.calculateAllSalaryByDepartment(id);
    }

    @GetMapping("/{id}/employees")
    public Collection<Employee> employeesDepartment(@PathVariable int id) {
        return employeeService.employeesDepartment(id);
    }


    @GetMapping("/employees")
    public Map<Integer, List<Employee>> allEmployeesDepartments() {
        return employeeService.allEmployeesDepartments();
    }
}

