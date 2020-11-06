package eu.nets.repository;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.stereotype.Repository;

import eu.nets.model.Employee;

@Repository
public class EmployeeRepository extends NamedParameterJdbcDaoSupport {

    @Autowired
    public void setParentDataSource(DataSource dataSource) {
        super.setDataSource(dataSource);
    }
    
    private static final String sql = "SELECT emp_no employeeNumber, " +
                                             "birth_date birthDate, " +
                                             "first_name firstName, " +
                                             "last_name lastName, " +
                                             "gender, " +
                                             "hire_date hireDate " +
                                             "FROM employees LIMIT 100";

    public List<Employee> getAllEmployees() {
        return getJdbcTemplate().query(sql, new BeanPropertyRowMapper<Employee>(Employee.class));
    }
}
