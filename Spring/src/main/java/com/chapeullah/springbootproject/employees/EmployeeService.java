package com.chapeullah.springbootproject.employees;

import java.time.LocalDate;
import java.util.List;

@Service
public class EmployeeService {

    public List<Employee> getAllEmployees() {
        return List.of(
			new Employee(
				1L, 
				"Denis",
				"chapeullah@gmail.com",
				LocalDate.of(2002, 8, 15),
				80000
			),
			new Employee(
				2L, 
				"Alice",
				"alice@gmail.com",
				LocalDate.of(2002, 12, 29),
				120000
			)
		);
    }

}
