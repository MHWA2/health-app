package healthcare.healthcare_spring.dto.request;

public class CalculateRequest {
    private int totalWalk;
    private float totalDistance;
    private float calorie;
    private Long measure;

    public CalculateRequest(int totalWalk, float totalDistance, float calorie, Long measure) {
        this.totalWalk = totalWalk;
        this.totalDistance = totalDistance;
        this.calorie = calorie;
        this.measure = measure;
    }

    public int getTotalWalk() {
        return totalWalk;
    }

    public float getTotalDistance() {
        return totalDistance;
    }

    public float getCalorie() {
        return calorie;
    }

    public Long getMeasure() {
        return measure;
    }
}
