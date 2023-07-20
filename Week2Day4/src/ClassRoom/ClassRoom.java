package ClassRoom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ClassRoom<T extends CollegeStudent> {

    private String classType;
    private Map<String, T> forStudent;
    private List<String> studentNames;

    public ClassRoom(String classType) {
        this.classType = classType;
        forStudent = new HashMap<>();
        studentNames = new ArrayList<>();
    }

    public void addStudent(T student) {
        forStudent.put(student.getStudentNum(), student);
        studentNames.add(student.getStudentName());
    }

    public T getStudentByStudentNumber(String studentNumber) {
        return forStudent.get(studentNumber);
    }

    public void printStudentNames() {
        StringBuilder sb = new StringBuilder();
        for (String name: studentNames){
            sb.append(",").append(name);
        }
        System.out.println("이 클래스 룸(" + this.classType + ")은 학생들 [" + sb.deleteCharAt(0) + "]가 있습니다.");
    }

}
