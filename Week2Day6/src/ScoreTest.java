import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ScoreTest {
    public static void main(String[] args){
        // List 제공
        List<Student> students = new ArrayList<>();

        students.add(new Student("아이유", "여자", 95));
        students.add(new Student("박보검", "남자", 92));
        students.add(new Student("송중기", "남자", 90));
        students.add(new Student("김태리", "여자", 85));
        students.add(new Student("전정국", "남자", 88));
        students.add(new Student("방탄소년단", "남자", 70));
        students.add(new Student("이지은", "여자", 63));
        students.add(new Student("윤아", "여자", 70));
        students.add(new Student("하정우", "남자", 75));
        students.add(new Student("공유", "남자", 80));

        //TODO: 남학생들 중 가장 낮은 성적을 가진 학생의 이름 출력하기
        String leastScoreStudent = students.stream()
                        .filter(student -> student.getGender().equals("남자"))
                .min(Comparator.comparingInt(Student::getScore))
                .map(student -> student.getName())
                .orElse("N/A");

        System.out.printf("가장 성적이 낮은 남학생 이름: %s\n", leastScoreStudent);

        //TODO: 여학생들 중 성적 상위 3명의 평균 성적 구하기
        double topThreeFemaleCount = students.stream()
                .filter(student -> student.getGender().equals("여자"))
                .count();

        double averageOfTopThree = topThreeFemaleCount < 3 ? 0 :
                students.stream()
                        .filter(student -> student.getGender().equals("여자"))
                                .sorted((m1, m2) -> m2.getScore() - m1.getScore())
                                        .limit(3)
                                                .mapToInt(student -> student.getScore())
                                                        .average()
                                                                .orElse(0);

        System.out.printf("여학생 상위 3명 평균: %.2f\n", averageOfTopThree);
    }
}
