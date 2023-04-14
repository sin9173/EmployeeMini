package hr.emp.entity;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Entity
@Table(name = "countries")
public class Country {

    @Id
    private String countryId;

    private String countryName;

    private Integer regionId;
}
