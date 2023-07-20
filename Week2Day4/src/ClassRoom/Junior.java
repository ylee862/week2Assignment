package ClassRoom;

public class Junior extends ElderGroupCollegeStudent{
    public Junior(String studentNum, String studentName, double gpa) {
        super(studentNum, studentName, gpa);
    }
    @Override
    public String toString() {
        return "Junior{" +
                "studentNumber=" + studentNum  +
                ", name=" + studentName +
                ", gpa=" + gpa +
                '}';
    }
}


