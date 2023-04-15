package hr.emp.service;

import hr.emp.dto.request.department.DepartmentListRequestDto;
import hr.emp.dto.request.department.DepartmentSalaryRequestDto;
import hr.emp.dto.response.ResponseDto;
import hr.emp.repository.employee.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;

    @Override
    public ResponseDto department_list(DepartmentListRequestDto dto) {
        return null;
    }

    @Override
    public ResponseDto department_salary(Long department_id, DepartmentSalaryRequestDto dto) {
        return null;
    }
}
