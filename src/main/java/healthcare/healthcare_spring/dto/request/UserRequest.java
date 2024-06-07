package healthcare.healthcare_spring.dto.request;

public class UserRequest {
    private String name;
    private int height;
    private int weight;
    private int goalWeight;

    public String getName() {
        return name;
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
