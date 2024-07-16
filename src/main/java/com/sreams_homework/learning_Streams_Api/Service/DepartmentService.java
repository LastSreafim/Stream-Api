package com.sreams_homework.learning_Streams_Api.Service;


import com.sreams_homework.learning_Streams_Api.Employee.Employee;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface DepartmentService {
    Employee minSalary(int department);

    Employee maxSalary(int department);

    Collection<Employee> employeesDepartment(int department);

    Map<Integer, List<Employee>> allEmployeesDepartments();
}

