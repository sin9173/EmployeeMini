package hr.emp.entity;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "countries")
public class Country {

    @Id
    private String countryId;

    private String countryName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "region_id")
    private Region region;
}
