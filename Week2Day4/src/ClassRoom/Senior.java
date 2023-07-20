package ClassRoom;

import java.util.HashMap;

public class Senior extends ElderGroupCollegeStudent{

    public Senior(String studentNum, String studentName, double gpa) {
        super(studentNum, studentName, gpa);
    }

    @Override
    public String toString() {
        return "Senior{" +
                "studentNumber=" + studentNum  +
                ", name=" + studentName +
                ", gpa=" + gpa +
                '}';
    }
}

