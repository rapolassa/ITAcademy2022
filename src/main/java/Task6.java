import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task6 {
    public static void main(String[] args) {
        Student a = new Student(1,"Jonas", 25, 4);
        Student b = new Student(2,"Petras", 24, 3);
        Student c = new Student(3,"Petras", 24, 3);
        Student d = new Student(4,"Petras", 24, 3);

        List<Student> students = new ArrayList<>();
        students.add(a);
        students.add(b);
        students.add(c);
        students.add(d);

        Map<Integer,Student> map = new HashMap<>();
        for (Student student:students) {
            map.put(student.getId(), student);
        }

        map.get(4).setGrade(10);
        map.get(4).setAge(30);

        for (Map.Entry<Integer, Student> student :map.entrySet()) {
            System.out.println(student.getKey() + " " + student);
        }
    }
}
