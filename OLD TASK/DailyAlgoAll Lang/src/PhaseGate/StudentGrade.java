package PhaseGate;

public class StudentGrade  {
    private String studentName;
    private List<Scores>;
    private String studentID;
    private int position;
    private double averageGrade;

    public StudentGrade(String studentName, String studentID, int position, double averageGrade) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.position = position;
        this.averageGrade = averageGrade;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {

        this.position = position;
    }

    public double getAverageGrade() {
        s
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }
}
