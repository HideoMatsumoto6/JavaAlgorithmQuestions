import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MergeTwoSortedArr {

    public static List<Integer> returnCommonIntersection(int[] arr1, int[] arr2) {
        int arr1Index = 0;
        int arr2Index = 0;
        List<Integer> intersectLst = new ArrayList<Integer>();
        while (arr1Index < arr1.length && arr2Index < arr2.length) {
            if(arr1[arr1Index] == arr2[arr2Index] && (arr1Index == 0 || arr1[arr1Index] != arr1[arr1Index - 1] )) {
                intersectLst.add(arr1[arr1Index]);
                arr1Index++;
                arr2Index++;
            } else if (arr1[arr1Index] > arr2[arr2Index]) {
                arr2Index++;
            } else {
                arr1Index++;
            }
        }
        return intersectLst;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(returnCommonIntersection(new int[]{3,5,7,9,11,13,16}, new int[]{3,8,11,34,55}).toArray()));
    }
}
