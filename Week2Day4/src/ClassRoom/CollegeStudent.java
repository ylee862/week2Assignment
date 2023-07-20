package ClassRoom;

abstract class CollegeStudent {
    protected String studentNum;
    protected String studentName;
    protected double gpa;

    public CollegeStudent(String studentNum, String studentName, double gpa) {
        this.studentName = studentName;
        this.studentNum = studentNum;
        this.gpa = gpa;
    }

    public String getStudentNum() {
        return studentNum;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "CollegeStudent{" +
                "studentNumber=" + studentNum  +
                ", name=" + studentName +
                ", gpa=" + gpa +
                '}';
    }
}


