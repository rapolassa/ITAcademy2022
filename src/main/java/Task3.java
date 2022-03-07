import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        List<String> carNames = Arrays.asList("Subaru", "Bmw", "Suzuki", "Subaru");

        Set<String> uniqueCarNames = new HashSet<>();
        uniqueCarNames.addAll(carNames);

        for (String carName:uniqueCarNames) {
            System.out.print(carName+ " ");
        }

        Set<String> uniqueCarNamesTree = new TreeSet<>(uniqueCarNames);

        System.out.println(" ");

        for (String carName:uniqueCarNamesTree) {
            System.out.print(carName+ " ");
        }

    }
}
