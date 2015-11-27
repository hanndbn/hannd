package org.hannd.c2.dao;

import org.hannd.c2.bean.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void createEmployee() {
        int a;
    }

    @Override
    public int getEmployeeCount() {
        String sql = "select count(*) from employee";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    @Override
    public int insertEmployee(Employee employee) {
        String insertQuery = "insert into employee (EmpId, Name, Age)values( ?,?,?)";
        Object[] params = new Object[]{employee.getId(), employee.getName(), employee.getAge()};
        int[] types = new int[]{Types.INTEGER, Types.VARCHAR,
                Types.INTEGER};
        int a;
        return jdbcTemplate.update(insertQuery, params, types);
    }

    @Override
    public Employee getEmployeeById(int empId) {
        String query = "select * from Employee where EmpId = ?";
        Employee employee = jdbcTemplate.queryForObject(query,
                new Object[]{empId}, new
                        RowMapper<Employee>() {
                            @Override
                            public Employee mapRow(ResultSet rs,
                                                   int rowNum)
                                    throws SQLException {
                                Employee employee = new
                                        Employee(rs.getInt("EmpId"), rs
                                        .getString("Name"), rs.getInt("Age"));
                                return employee;
                            }
                        });
        return employee;
    }

    @Override
    public int deleteEmployeeById(int empId) {
        String delQuery = "delete from employee where EmpId = ? ";
        return jdbcTemplate.update(delQuery, new Object[]{
                empId});
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}