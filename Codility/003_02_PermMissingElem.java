// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int N = A.length;

        long sum = 0;
        long finalSum = N+1;

        for(int i = 0; i < N; i++) {
            sum += A[i];
            finalSum += (i+1);
        }

        return (int)(finalSum-sum);
    }
}
