package com.liso.springboot.entities;

import org.springframework.boot.autoconfigure.domain.Entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

public class Employee {

}

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @column(name = "employee_id")

    private int id;
    @Notnull
    private String employeename;
    @Notnull
    private String department;
    @Notnull
    private Date joiningdate;
    @Notnull
    private int age;
    @Notnull
    private String address;
    @Notnull
    private float salary;
    private ZonedDateTime lefton;
    @Notnull
    private boolean leftjob;

    public Employee() {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmplpyeename(){
        return employeename;
    }

}
}