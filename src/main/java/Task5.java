import java.util.HashMap;
import java.util.Map;

public class Task5 {
    public static void main(String[] args) {
        Student a = new Student(1,"Jonas", 25, 4);
        Student b = new Student(2,"Petras", 24, 3);

        Map<Integer, Student> map = new HashMap<>();
        map.put(1, a);
        map.put(2, b);

        System.out.println(map);

        map.get(2).setGrade(10);

        System.out.println(map);

    }
}
