package healthcare.healthcare_spring.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    private String name;
    private int height;
    private int weight;
    private int goalWeight;
    private int date;
    private int goalWalk;

    public int getDate() {
        return date;
    }

    public int getGoalWalk() {
        return goalWalk;
    }

    protected User() {}

    public String getName() {
        return name;
    }

    public User(String name, int height, int weight, int goalWeight, int date, int goalWalk) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.goalWeight = goalWeight;
        this.date = date;
        this.goalWalk = goalWalk;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getGoalWeight() {
        return goalWeight;
    }
}
