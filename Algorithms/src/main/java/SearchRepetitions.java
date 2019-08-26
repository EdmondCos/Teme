import java.util.HashMap;
import java.util.Map;

public class SearchRepetitions {
    private static String searchCases(int[] grades) {
        int[] repetitions = new int[10];

        for (int grade : grades) {
            if (grade > 0 && grade < 11) {
                repetitions[grade - 1]++;
            }
        }

        StringBuilder x = new StringBuilder();
        for (int i = 0; i < repetitions.length; i++) {
            if (repetitions[i] > 0)
                x.append("Numarul notelor de ").append(i + 1).append(": ").append(repetitions[i]).append('\n');
        }
        return x.toString();
    }

    private static Map<Integer, Integer> searchCasesHashMap(int[] grades) {
        Map<Integer, Integer> result = new HashMap<>();

        for (int grade : grades) {
            if (result.containsKey(grade)) {
                int key = result.get(grade);
                result.put(grade, key + 1);
            } else {
                result.put(grade, 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] y = {4, 2, 4, 10, 6, 9, 10, 10};
        System.out.println(searchCasesHashMap(y));
        System.out.println(searchCases(y));

    }
}
