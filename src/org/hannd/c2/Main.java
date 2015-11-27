package org.hannd.c2;

import org.hannd.c2.dao.EmployeeDao;
import org.hannd.c2.dao.EmployeeDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by MT257 on 11/23/2015.
 */
public class Main {
    private EmployeeDao employeeDao;

    public static void main(String[] args) {

        String[] paths = {"applicationContext.xml"};
        ApplicationContext context = new ClassPathXmlApplicationContext(paths);
        EmployeeDao employeeDao = context.getBean("employeeDaoImpl", EmployeeDao.class);
        System.out.println(employeeDao.getEmployeeCount());
        System.out.println("END");
    }
}
