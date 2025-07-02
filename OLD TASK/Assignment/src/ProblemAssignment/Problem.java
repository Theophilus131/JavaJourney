package ProblemAssignment;

public class Problem {
    private String name;
    private String type;
    private boolean status;

    public Problem(String name, String type, boolean status) {
        this.name = name;
        this.type = type;
        this.status = status;
    }
    public String getName() {
        return name;
    }

    public boolean isStatus() {
        return status;
    }
}
