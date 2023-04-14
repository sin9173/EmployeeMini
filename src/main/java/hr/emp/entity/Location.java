package hr.emp.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "locations")
public class Location {

    @Id
    private Long locationId;

    private String streetAddress;

    private String postalCode;

    private String city;

    private String stateProvince;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "country_id")
    private Country country;
}
