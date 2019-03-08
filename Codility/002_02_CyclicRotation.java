// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        int N = A.length;
        int ans[] = new int[N];

        for(int i = 0; i < N; i++) {
            ans[(i+K)%N] = A[i];
        }

        return ans;
    }
}
