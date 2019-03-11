// you can also use imports, for example:
import java.util.*;

class Solution {
    public int solution(int[] A) {
        HashMap<Integer, Integer> cnt = new HashMap<Integer, Integer>();

        for(int i = 0; i < A.length; i++) {
            int counted = (cnt.containsKey(A[i])? cnt.get(A[i]) : 0);
            cnt.put(A[i], counted+1);

            if(cnt.get(A[i]) >= A.length/2+1)
                return i;
        }

        return -1;
    }
}
