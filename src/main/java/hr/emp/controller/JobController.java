package hr.emp.controller;

import hr.emp.dto.request.job.JobHistoryRequestDto;
import hr.emp.dto.response.ListResponseDto;
import hr.emp.dto.response.job.JobHistoryDto;
import hr.emp.service.JobService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/job")
@RequiredArgsConstructor
public class JobController {

    private final JobService jobService;

    @GetMapping("/history/{employee_id}")
    @Operation(summary = "사원 이력 조회", description = "특정 사원의 이력 정보를 조회합니다.")
    public ResponseEntity<ListResponseDto<JobHistoryDto>> job_history(@ModelAttribute JobHistoryRequestDto dto) {
        return null;
    }
}
