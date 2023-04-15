package hr.emp.controller;

import hr.emp.dto.request.employee.EmployeeInfoRequestDto;
import hr.emp.dto.request.employee.EmployeeUpdateRequestDto;
import hr.emp.dto.response.ResponseDto;
import hr.emp.dto.response.SingleResponseDto;
import hr.emp.dto.response.employee.EmployeeInfoDto;
import hr.emp.service.EmployeeService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/{employee_id}")
    @Operation(summary = "사원 정보 조회", description = "특정 사원의 현재 정보를 조회합니다.")
    public ResponseEntity<SingleResponseDto<EmployeeInfoDto>> employee_info(@ModelAttribute EmployeeInfoRequestDto dto) {
        return null;
    }

    @PatchMapping("/{employee_id}")
    @Operation(summary = "사원 정보 수정", description = "특정 사원의 정보를 수정합니다.")
    public ResponseEntity<ResponseDto> employee_update(@PathVariable("employee_id") Long employee_id, @RequestBody EmployeeUpdateRequestDto dto) {
        return null;
    }
}
