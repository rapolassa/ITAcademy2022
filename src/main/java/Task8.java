import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task8 {
    public static void main(String[] args) {
        Student a = new Student(1,"Jonas", 25, 4);
        Student b = new Student(2,"Petras", 10, 3);
        Student c = new Student(3,"Petras", 15, 3);
        Student d = new Student(4,"Petras", 24, 3);

        List<Student> students = new ArrayList<>();
        students.add(a);
        students.add(b);
        students.add(c);
        students.add(d);

        Collections.sort(students, new AgeComparator().reversed());

        for (Student student:students) {
            System.out.println(student);
        }
    }
}
