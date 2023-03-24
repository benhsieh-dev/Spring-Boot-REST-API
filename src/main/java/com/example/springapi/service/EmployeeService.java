package com.example.springapi.service;
import com.example.springapi.api.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {
    private List<Employee> employeeList;

    public EmployeeService() {

        employeeList = new ArrayList<>();

        Employee emp1 = new Employee(1, "Ash", "Ketchum");
        Employee emp2 = new Employee(2, "Sonic", "Hedgehog");
        Employee emp3 = new Employee(3, "Doctor", "Eggman");
        Employee emp4 = new Employee(4, "Purple", "Sonic");
        Employee emp5 = new Employee(5, "Charmy", "Bee");

        employeeList.addAll(Arrays.asList(emp1, emp2, emp3, emp4, emp5));
    }

    public List<Employee> getEmployees() {
        return employeeList;
    }
}
