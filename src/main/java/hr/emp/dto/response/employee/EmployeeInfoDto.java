package hr.emp.dto.response.employee;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class EmployeeInfoDto { //사원정보

    private Long employee_id;

    private String first_name;

    private String last_name;

    private String phone_number;

    private LocalDate hire_date;
}
