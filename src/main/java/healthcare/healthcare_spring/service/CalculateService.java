package healthcare.healthcare_spring.service;

import healthcare.healthcare_spring.domain.Calculate;
import healthcare.healthcare_spring.domain.CalculateRepository;
import healthcare.healthcare_spring.dto.request.CalculateRequest;
import healthcare.healthcare_spring.repository.CalculateJdbcRepository;
import org.springframework.stereotype.Service;

@Service
public class CalculateService {
    private final CalculateRepository calculateRepository;

    public CalculateService(CalculateRepository calculateRepository) {
        this.calculateRepository = calculateRepository;
    }

    public void saveCalculate(CalculateRequest request) {
        Calculate u = calculateRepository.save(new Calculate(request.getTemperature(), request.getBpm()));
    }
}
