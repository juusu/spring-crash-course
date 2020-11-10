package eu.nets.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="employees")
public class Employee {
    
    @Id
    @Getter
    @Setter
    @Column(name="emp_no")
    private Integer employeeNumber;

    @Getter
    @Setter
    @Column(name="birth_date")
    private Date birthDate;
    
    @Getter
    @Setter
    @Column(name="first_name")
    private String firstName;
    
    @Getter
    @Setter
    @Column(name="last_name")
    private String lastName;
    
    @Getter
    @Setter
    private String gender;
    
    @Getter
    @Setter
    @Column(name="hire_date")
    private Date hireDate;
    
}
