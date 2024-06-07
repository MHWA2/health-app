package healthcare.healthcare_spring.domain;

import jakarta.persistence.*;

@Entity
public class Calculate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = null;

    private int totalWalk;
    private float totalDistance;
    private float calorie;
    private Long measure;
    protected Calculate() {}

    public Calculate(int totalWalk, float totalDistance, float calorie, Long measure) {
        this.totalWalk = totalWalk;
        this.totalDistance = totalDistance;
        this.calorie = calorie;
        this.measure = measure;
    }

    public Long getId() {
        return id;
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
