package hr.emp.dto.request.job;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class JobHistoryRequestDto { //특정 사원의 이력정보 조회 요청데이터

    private Long employee_id; //사원 인덱스
}
