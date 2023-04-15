package hr.emp.service;

import hr.emp.dto.request.employee.EmployeeInfoRequestDto;
import hr.emp.dto.request.employee.EmployeeUpdateRequestDto;
import hr.emp.dto.response.ResponseDto;

public interface EmployeeService {

    ResponseDto employeeInfo(EmployeeInfoRequestDto dto); //특정사원의 정보 조회
    
    ResponseDto employeeUpdate(String employee_id, EmployeeUpdateRequestDto dto); //특정사원의 정보 수정
}
