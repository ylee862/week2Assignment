package ClassRoom;

abstract class ElderGroupCollegeStudent extends CollegeStudent {
    public ElderGroupCollegeStudent(String studentNum, String studentName, double gpa) {
        super(studentNum, studentName, gpa);
    }
    @Override
    public String toString() {
        return "ElderGroupCollegeStudent{" +
                "studentNumber=" + studentNum  +
                ", name=" + studentName +
                ", gpa=" + gpa +
                '}';
    }
}

