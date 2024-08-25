import java.util.Arrays;
import java.lang.reflect.Array;

public class Permutation {
    static <T> T[] applyPermutation(T[] oriArr, int[] P) throws Exception {
        if(P.length > oriArr.length) {
            throw new Exception("The given Permutation array is too long");
        }
        T[] newArr = (T[]) Array.newInstance(oriArr.getClass().getComponentType(), oriArr.length);
        for(int i=0; i < oriArr.length; i++) {
            newArr[i] = oriArr[i];
        }
        for(int pIndex=0; pIndex < P.length; pIndex++) {
            newArr[P[pIndex]] = oriArr[pIndex];
        }
        return newArr;

    }
    public static void main(String[] args) {
        int[] P = {2,0,1,3};
        String[] originalArr = new String[]{"henry", "jimmy", "tom", "thrall"};

        Character[] charArr = new Character[]{'A', 'B', 'C', 'D'};
        try {
            String[] targetArr = Permutation.applyPermutation(originalArr, P);
            Character[] resultArr = Permutation.applyPermutation(charArr, P);
            System.out.println(Arrays.toString(targetArr));
            System.out.println(Arrays.toString(resultArr));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("an exception is thrown");
        }

    }
}
