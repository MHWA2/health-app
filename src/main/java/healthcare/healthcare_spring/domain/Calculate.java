package healthcare.healthcare_spring.domain;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Calculate {
    @Id
    private Integer day;
    private Integer totalStep;
    private Integer year;
    private Integer month;

    private String name;
    protected Calculate() {}

    public Calculate(Integer totalStep, String name) {
        this.totalStep = totalStep;
        this.name = name;
    }

    @PrePersist
    public void prePersist() {
        LocalDate now = LocalDate.now();
        this.year = now.getYear();
        this.month = now.getMonthValue();
        this.day = now.getDayOfMonth();
    }

    public Integer getDay() {
        return day;
    }

    public Integer getTotalStep() {
        return totalStep;
    }

    public Integer getYear() {
        return year;
    }

    public Integer getMonth() {
        return month;
    }

    public String getName() {
        return name;
    }
}
