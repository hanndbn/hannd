package org.hannd.c2.dao;

import org.hannd.c2.bean.Employee;

/**
 * Created by MT257 on 11/24/2015.
 */
public interface EmployeeDao {
    void createEmployee();
    int getEmployeeCount();
    int insertEmployee(Employee employee);
    int deleteEmployeeById(int empId);
    Employee getEmployeeById(int empId);
}
