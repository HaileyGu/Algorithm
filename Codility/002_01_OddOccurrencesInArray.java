// you can also use imports, for example:
// import java.util.*;
import java.util.HashMap;
import java.util.Set;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        HashMap<Integer, Integer> mark = new HashMap<Integer, Integer>();
        Set<Integer> keys = mark.keySet();

        int ans = 0;
        for(int i = 0; i < A.length; i++) {
            if(mark.containsKey(A[i])) {
                mark.remove(A[i]);
            }
            else {
                mark.put(A[i], 1);
            }
        }

        //print all the keys
        for (Integer key : keys) {
            ans = key;
        }

        return ans;
    }
}
