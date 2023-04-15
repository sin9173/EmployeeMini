package hr.emp.controller;

import hr.emp.dto.request.department.DepartmentListRequestDto;
import hr.emp.dto.request.department.DepartmentSalaryRequestDto;
import hr.emp.dto.response.ListResponseDto;
import hr.emp.dto.response.ResponseDto;
import hr.emp.dto.response.department.DepartmentDto;
import hr.emp.service.DepartmentService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
@RequiredArgsConstructor
public class DepartmentController {

    private final DepartmentService departmentService;

    @GetMapping("/")
    @Operation(summary = "부서 정보 조회", description = "부서 정보 및 위치정보의 리스트를 조회합니다.")
    public ResponseEntity<ListResponseDto<DepartmentDto>> depart_list(@ModelAttribute DepartmentListRequestDto dto) {
        return null;
    }

    @PatchMapping("/salary/{department_id}")
    @Operation(summary = "부서 급여 인상", description = "특정 부서의 급여를 특정 비율로 인상합니다.")
    public ResponseEntity<ResponseDto> department_salary(@PathVariable("department_id") Long department_id, @RequestBody DepartmentSalaryRequestDto dto) {
        return ResponseEntity.ok(departmentService.department_salary(department_id, dto));
    }
}
