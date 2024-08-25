import java.util.*;

public class RandomSampling {
    static void sampleCollection(int subGroupSize, List<Integer> A) {
        Random gen = new Random();
        for (int i = 0; i < subGroupSize; i++) {
            Collections.swap(A, i, i + gen.nextInt(A.size() - i));
        }

    }

    public static void main(String[] args) {
        Integer[] arr = {3,5,88,1};

        ArrayList<Integer> originalArr = new ArrayList<>(Arrays.asList(arr));
        RandomSampling.sampleCollection(3, originalArr);

        System.out.println(originalArr.toString());

    }
}
