package hr.emp.dto.response.department;

import hr.emp.entity.Department;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class DepartmentDto { //부서정보

    private Long department_id;

    private String department_name;

    private String street_address;

    private String postal_code;

    private String city;

    private String state_province;

    private String country_name;

    private String region_name;

    private Long manager_id;

    public DepartmentDto(Department department) {
        this.department_id = department.getDepartmentId();
        this.department_name = department.getDepartmentName();
        this.street_address = department.getLocation().getStreetAddress();
        this.postal_code = department.getLocation().getPostalCode();
        this.city = department.getLocation().getCity();
        this.state_province = department.getLocation().getStateProvince();
        this.country_name = department.getLocation().getCountry().getCountryName();
        this.region_name = department.getLocation().getCountry().getRegion().getRegionName();

    }

}
