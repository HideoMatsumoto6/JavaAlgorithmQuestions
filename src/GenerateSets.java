import java.util.*;

public class GenerateSets {
    static Set<Set<Integer>> generateSubsetsOfLengthK(int bound, int k) {
        int[] nums = new int[bound];
        for(int i = 0; i < nums.length; i++) {
            nums[i] = i;
        }
        Set<Set<Integer>> result = new LinkedHashSet<>();
        generateSubsets(nums, k, 0, new LinkedHashSet<>(), result);
        return result;
   }


   public static void generateSubsets(int[] nums, int k, int index, Set<Integer> current, Set<Set<Integer>> result) {

        if(current.size()==k) {
            result.add(new LinkedHashSet<>(current));
            System.out.println(Arrays.toString(current.toArray()));
            System.out.println(Arrays.toString(result.toArray()));
            return;
        }
        for(int i = index; i < nums.length; i++) {
            current.add(nums[i]);
            generateSubsets(nums, k, i + 1, current, result);
            current.remove(nums[i]);
        }

   }
    public static void main(String[] args) {
        Set<Integer> hashSet1 = new LinkedHashSet<>();
        hashSet1.add(1);
        hashSet1.add(2);


        Set<Integer> hashSet2 = new LinkedHashSet<>();
        hashSet2.add(1);
        hashSet2.add(2);

        System.out.println(hashSet1 == hashSet2);

        HashMap<Integer, String> hashM1 = new HashMap<>();
        hashM1.put(1, "James");
        hashM1.put(2, "Dental");


        HashMap<Integer, String> hashM2 = new HashMap<>();
        hashM2.put(1, "James");
        hashM2.put(2, "Dental");
        System.out.println(hashM1 == hashM2);


        Set<Set<Integer>> result = generateSubsetsOfLengthK(6, 2);
        Set<Set<Integer>> result2 = generateSubsetsOfLengthK(11, 3);

    }
}
