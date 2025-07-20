package com.samarth.employee.service;

import com.samarth.employee.dao.EmployeeDAO;
import com.samarth.employee.model.Employee;

public class EmployeeService {
    private EmployeeDAO dao = new EmployeeDAO();

    public boolean registerEmployee(Employee emp) {
        return dao.insertEmployee(emp);
    }
}
