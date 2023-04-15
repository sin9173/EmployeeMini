package hr.emp.service;

import hr.emp.dto.request.department.DepartmentListRequestDto;
import hr.emp.dto.request.department.DepartmentSalaryRequestDto;
import hr.emp.dto.response.ResponseDto;

public interface DepartmentService {

    ResponseDto department_list(DepartmentListRequestDto dto); //부서 정보 조회

    ResponseDto department_salary(Long department_id, DepartmentSalaryRequestDto dto); //특정부서의 급여 수정
}
