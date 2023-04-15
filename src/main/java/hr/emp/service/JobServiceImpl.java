package hr.emp.service;

import hr.emp.dto.request.job.JobHistoryRequestDto;
import hr.emp.dto.response.ResponseDto;
import hr.emp.repository.job.JobHistoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
@RequiredArgsConstructor
public class JobServiceImpl implements JobService {

    private final JobHistoryRepository jobHistoryRepository;

    @Override
    public ResponseDto job_history(JobHistoryRequestDto dto) {
        return null;
    }
}
