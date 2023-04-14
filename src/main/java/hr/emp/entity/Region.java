package hr.emp.entity;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Table(name = "regions")
public class Region {

    @Id
    private Long region_id;

    private String regionName;
}
