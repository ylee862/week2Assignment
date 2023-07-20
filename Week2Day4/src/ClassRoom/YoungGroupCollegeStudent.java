package ClassRoom;

abstract class YoungGroupCollegeStudent extends CollegeStudent {

    public YoungGroupCollegeStudent(String studentNum, String studentName, double gpa) {
        super(studentNum, studentName, gpa);
    }

    @Override
    public String toString() {
        return "YoungGroupCollegeStudent{" +
                "studentNumber=" + studentNum  +
                ", name=" + studentName +
                ", gpa=" + gpa +
                '}';
    }
}

