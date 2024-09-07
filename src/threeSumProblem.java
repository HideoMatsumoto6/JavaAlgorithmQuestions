import java.util.Arrays;

public class threeSumProblem {

    public static boolean canSum(int[] numArr, int target) {
        boolean[] ifTargetNumberCanSum = new boolean[target+1];
        ifTargetNumberCanSum[0] = true;

            for(int i = 1; i < target + 1; i ++) {
                for(int num: numArr) {
                    System.out.println(i);
                    if (i - num >= 0) {
                        if (ifTargetNumberCanSum[i - num]) {
                            ifTargetNumberCanSum[i] = true;
                            break;
                        }
                    }
                }
            }

        System.out.println(Arrays.toString(ifTargetNumberCanSum));
        return ifTargetNumberCanSum[target];
    }
    public static void main(String[] args) {

        int[] intArr = new int[]{4,6,3};
        System.out.println(canSum(intArr, 7));
    }

}

