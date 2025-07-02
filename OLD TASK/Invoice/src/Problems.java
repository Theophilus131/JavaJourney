import java.util.ArrayList;
import java.util.List;

public class Problems {
    private String name;
    private String type;
    private boolean isSolved;

    public Problems(String name, String type, boolean isSolved) {
        this.name = name;
        this.type = type;
        this.isSolved = false;
    }
    public void solve(){
        this.isSolved = true;
    }
    public boolean isSolved() {
        return isSolved;
    }
    public String getDescription() {
        return type + "problem" + name;
    }

}

class Person{
    private String name;
    private List<Problems> problems;

    public Person(String name){
        this.name = name;
        this.problems = new ArrayList<>();
    }
    public void addProblem(Problems problem){
        problems.add(problem);
    }
    public void solveProblem(String name){
        for(Problems p : this.problems){}
    }
}

