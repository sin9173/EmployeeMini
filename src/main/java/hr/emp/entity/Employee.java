package hr.emp.entity;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    private Long employeeId;

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private LocalDate hireDate;

    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job job;

    private Long salary;

    private Long commissionPct;

    @ManyToOne
    @JoinColumn(name = "manager_id")
    private Employee manager;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
}
