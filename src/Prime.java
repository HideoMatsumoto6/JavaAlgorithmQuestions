import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Prime {
    static List<Integer> allPrimeNumbersTo(int num) {
        List<Integer> resultPrimeArrLst = new ArrayList<>();
        Set<Integer> itemsToBeKickedOut = new HashSet<Integer>();
        for(int i = 2; i <= num; i++) {
            if(!itemsToBeKickedOut.contains(i)) {
                boolean isNumberPrime = true;
                for (int j = 2; j <= Math.floor(Math.sqrt(i)); j++) {
                    if (i % j == 0) {
                        isNumberPrime = false;
                    }
                }
                if (isNumberPrime) {
                    resultPrimeArrLst.add(i);
                }
                // sift out the numbers that are a multiplier of this prime number
                for (int m = 1; m <= Math.floor(num / i); m++) {

                    itemsToBeKickedOut.add(m * i);
                }
            }
        }
        return resultPrimeArrLst;
    }
    public static void main(String[] args) {
    System.out.println(Prime.allPrimeNumbersTo(400));
    }
}
