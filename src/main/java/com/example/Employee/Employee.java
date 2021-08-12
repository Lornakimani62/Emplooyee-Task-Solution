package com.example.Employee;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Employee {
    @Id
    @SequenceGenerator(
            name = "employee_sequence",
            sequenceName = "employee_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "employee_sequence"
    )

    private Long Id;
    private String name;
    private LocalDate dob;
    private String gender;
    private String email;

    public Employee() {
    }

    public Employee(Long id, String name, LocalDate dob, String gender, String email) {
        Id = id;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.email = email;
    }

    public Employee(String name, LocalDate dob, String gender, String email) {
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.email = email;
    }

    public Long getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
