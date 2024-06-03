package healthcare.healthcare_spring.dto.request;

public class CalculateRequest {
    private int temperature;
    private int bpm;

    public int getTemperature() {
        return temperature;
    }

    public int getBpm() {
        return bpm;
    }
}
