// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        HashSet<Integer> frogPath = new HashSet<Integer>();

        int N = A.length;

        for(int i = 0; i < N; i++) {
            if(A[i] <= X) {
                if(frogPath.contains(A[i]) == false)
                    frogPath.add(A[i]);

                if(frogPath.size() == X)
                    return i;
            }
        }

        return -1;
    }
}
