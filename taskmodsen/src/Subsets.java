import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static List<List<Integer>> generateSubsets(int[] numbers) {
        List<List<Integer>> currentSubsets = new ArrayList<>();
        currentSubsets.add(new ArrayList<>());

        for (int element : numbers) {
            int size = currentSubsets.size();
            for (int j = 0; j < size; j++) {
                List<Integer> newSubset = new ArrayList<>(currentSubsets.get(j));
                newSubset.add(element);
                currentSubsets.add(newSubset);
            }
        }
        return currentSubsets;
    }

    public static void main(String[] args) {
        int[] inputNumbers = {1, 2, 3, 4, 5, 6, 7};
        List<List<Integer>> result = generateSubsets(inputNumbers);
        System.out.println(result);
    }
}