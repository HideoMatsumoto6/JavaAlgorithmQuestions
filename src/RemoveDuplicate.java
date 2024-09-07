import java.util.*;

public class RemoveDuplicate {
    static int[] removeDuplicatesFromSortedArrRetainSortedArraySize(int[] sortedArr) {
        int[] resArr = new int[sortedArr.length];
        Arrays.fill(resArr, 0);
        System.out.println(Arrays.toString(resArr));
        Set<Integer> duplciated = new HashSet<Integer>();
        int pivot = 0;
        for(int i = 0; i < sortedArr.length; i++) {
            if(!duplciated.contains(sortedArr[i])) {
                resArr[pivot] = sortedArr[i];
                pivot++;
                duplciated.add(sortedArr[i]);
            } else {
            }
            System.out.println(Arrays.toString(duplciated.toArray()));
        }
        return resArr;
    }
    public static void main(String[] args) {
        int[] arr =  { 2,3,5,5,7,11,11,11,13 };
        int[] res = RemoveDuplicate.removeDuplicatesFromSortedArrRetainSortedArraySize(arr);
        int[] result = RemoveDuplicate.removeDuplicatesFromSortedArr(arr);
    }


    static int[] removeDuplicatesFromSortedArr(int[] sortedArr) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        Set<Integer> duplciated = new HashSet<Integer>();
        for(int i = 0; i < sortedArr.length; i++) {
            if(!duplciated.contains(sortedArr[i])) {
                arrList.add(sortedArr[i]);
                duplciated.add(sortedArr[i]);
            }
        }
        int[] resArr = new int[arrList.size()];
        for(int i=0; i < arrList.size(); i++) {
            resArr[i]=arrList.get(i);
        }
        return resArr;
    }
}
