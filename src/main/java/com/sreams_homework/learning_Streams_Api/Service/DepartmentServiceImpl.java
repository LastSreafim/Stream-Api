package com.sreams_homework.learning_Streams_Api.Service;

import com.sreams_homework.learning_Streams_Api.Employee.Employee;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.sreams_homework.learning_Streams_Api.Exceptions.EmployeeNotFoundException;

import static java.util.Comparator.comparingDouble;
import static java.util.stream.Collectors.groupingBy;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    private final EmployeeService employeeService;

    public DepartmentServiceImpl(EmployeeService employeeServiceImpl) {
        this.employeeService = employeeServiceImpl;
    }

    @Override
    public Employee minSalary(int department) {
        return employeeService.getEmployees().stream()
                .filter(emp -> emp.getDepartment() == department)
                .min(comparingDouble(Employee::getSalary))
                .orElseThrow(EmployeeNotFoundException::new);
    }

    @Override
    public Employee maxSalary(int department) {
        return employeeService.getEmployees().stream()
                .filter(emp -> emp.getDepartment() == department)
                .max(comparingDouble(Employee::getSalary))
                .orElseThrow(EmployeeNotFoundException::new);
    }

    @Override
    public Collection<Employee> employeesDepartment(int department) {
        return employeeService.getEmployees().stream()
                .filter(e -> e.getDepartment() == department)
                .collect(Collectors.toList());
    }

    @Override
    public Map<Integer, List<Employee>> allEmployeesDepartments() {
        return employeeService.getEmployees().stream()
                .collect(groupingBy(Employee::getDepartment));
    }
}
