package hr.emp.entity;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Table(name = "jobs")
public class Job {

    @Id
    private String jobId;

    private String jobTitle;

    private Long minSalary;

    private Long maxSalary;


}
