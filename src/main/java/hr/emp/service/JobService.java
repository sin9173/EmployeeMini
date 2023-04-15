package hr.emp.service;

import hr.emp.dto.request.job.JobHistoryRequestDto;
import hr.emp.dto.response.ResponseDto;

public interface JobService {
    ResponseDto job_history(JobHistoryRequestDto dto); //특정 사원의 이력조회
}
