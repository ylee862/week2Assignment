package ClassRoom;

public class Sophomore extends YoungGroupCollegeStudent{
    public Sophomore(String studentNum, String studentName, double gpa) {
        super(studentNum, studentName, gpa);
    }

    @Override
    public String toString() {
        return "Sophomore{" +
                "studentNumber=" + studentNum  +
                ", name=" + studentName +
                ", gpa=" + gpa +
                '}';
    }
}

