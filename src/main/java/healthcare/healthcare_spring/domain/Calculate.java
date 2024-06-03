package healthcare.healthcare_spring.domain;

import jakarta.persistence.*;

@Entity
public class Calculate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = null;

    @Column(nullable = false)
    private int temperature;
    private int bpm;

    protected Calculate() {}

    public Calculate(int temperature, int bpm) {
        this.temperature = temperature;
        this.bpm = bpm;
    }

    public int getTpt() {
        return temperature;
    }

    public int getBpm() {
        return bpm;
    }
}
