package hr.emp.dto.request.employee;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class EmployeeInfoRequestDto { //특정사원의 현재 정보 조회

    private Long employee_id; //사원 인덱스
}
