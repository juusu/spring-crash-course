package eu.nets.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

public class Employee {
    
    @Getter
    @Setter
    private Integer employeeNumber;

    @Getter
    @Setter
    private Date birthDate;
    
    @Getter
    @Setter
    private String firstName;
    
    @Getter
    @Setter
    private String lastName;
    
    @Getter
    @Setter
    private String gender;
    
    @Getter
    @Setter
    private Date hireDate;
    
}
