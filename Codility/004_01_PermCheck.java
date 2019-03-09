// you can also use imports, for example:
// import java.util.*;
import java.util.Arrays;


// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int N = A.length;

        Arrays.sort(A);

        for(int i = 0; i < N; i++) {
            if(A[i] != i+1)
                return 0;
        }

        return 1;
    }
}
