import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task10 {
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

         students.stream().forEach(student -> student.setGrade(10));

        for (Student student:students) {
            System.out.println(student);
        }

        List<Student> notPetras = students.stream().filter(student -> !student.getName().equals("Petras")).toList();

        System.out.println(" ");

        for (Student student:notPetras) {
            System.out.println(student);
        }
    }
}
