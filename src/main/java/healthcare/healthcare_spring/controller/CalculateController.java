package healthcare.healthcare_spring.controller;

import healthcare.healthcare_spring.dto.request.CalculateRequest;
import healthcare.healthcare_spring.service.CalculateService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculateController {
    private final CalculateService calculateService;

    public CalculateController(CalculateService calculateService) {
        this.calculateService = calculateService;
    }

    @PostMapping("/calculate")
    public void saveCalculate(@RequestBody CalculateRequest request) {
        calculateService.saveCalculate(request);
    }
}
