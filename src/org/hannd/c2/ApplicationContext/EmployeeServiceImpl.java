package org.hannd.c2.ApplicationContext;

import org.hannd.c2.dao.EmployeeDao;

/**
 * Created by MT257 on 11/23/2015.
 */
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeDao employeeDao = null;

    public EmployeeServiceImpl(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public EmployeeDao generatEmployeeId() {
        return employeeDao;
    }

    public EmployeeDao getEmployeeDao() {
        return employeeDao;
    }

    public EmployeeServiceImpl setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
        return this;
    }
}
