// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int N = A.length;

        boolean isFirst = true;
        for(int i = 0; i < N; i++) {
            if(A[i] <= 0)
                continue;

            if(isFirst) {
                if(A[i] == 1) {
                    isFirst = false;
                }
                else
                    return 1;
            }
            else {
                if(A[i]-A[i-1] > 1)
                    return A[i-1]+1;
            }
        }

        return (isFirst)?1:A[N-1]+1;
    }
}
