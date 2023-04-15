package hr.emp.service;

import hr.emp.dto.request.employee.EmployeeInfoRequestDto;
import hr.emp.dto.request.employee.EmployeeUpdateRequestDto;
import hr.emp.dto.response.ResponseDto;
import hr.emp.repository.employee.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Override
    public ResponseDto employeeInfo(EmployeeInfoRequestDto dto) {
        return null;
    }

    @Override
    public ResponseDto employeeUpdate(String employee_id, EmployeeUpdateRequestDto dto) {
        return null;
    }
}
