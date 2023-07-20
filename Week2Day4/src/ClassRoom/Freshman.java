package ClassRoom;

public class Freshman extends YoungGroupCollegeStudent{
    public Freshman(String studentNum, String studentName, double gpa) {
        super(studentNum, studentName, gpa);
    }

    @Override
    public String toString() {
        return "Freshman{" +
                "studentNumber=" + studentNum  +
        ", name=" + studentName +
        ", gpa=" + gpa +
                '}';
    }
}

