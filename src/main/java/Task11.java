import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Task11 {
    public static void main(String[] args) {
        Student a = new Student(1, "Jonas", 25, 4);
        Student b = new Student(2, "Petras", 10, 3);
        Student c = new Student(3, "Petras", 15, 3);
        Student d = new Student(4, "Petras", 24, 3);

        List<Student> students = new ArrayList<>();
        students.add(a);
        students.add(b);
        students.add(c);
        students.add(d);

        System.out.println(students);

        List<Student> sorted = students.stream().sorted(Comparator.comparingInt(Student::getAge)).toList();
        System.out.println(sorted);

        Optional<Student> minAgeStudent = students.stream().min(Comparator.comparingInt(Student::getAge));
        System.out.println(minAgeStudent.get());

        Optional<Student> maxAgeStudent = students.stream().max(Comparator.comparingInt(Student::getAge));
        System.out.println(maxAgeStudent.get());
    }
}
