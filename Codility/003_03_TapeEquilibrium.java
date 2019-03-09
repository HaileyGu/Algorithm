// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int N = A.length;
        int ans = 0;

        // P1
        int left = A[0];
        int right = A[1];
        for(int i = 2; i < N; i++) {
            right += A[i];
        }

        // P2~
        int gap = Math.abs(left-right);
        for(int i = 1; i < N-1; i++) {
            left += A[i];
            right -= A[i];
            int tempGap = Math.abs(left-right);
            if(gap > tempGap)
                gap = tempGap;
        }

        return gap;
    }
}
