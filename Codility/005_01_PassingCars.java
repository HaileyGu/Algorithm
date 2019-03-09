// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {

        final int maxPassingCars = 1000000000;
        // write your code in Java SE 8
        int N = A.length;
        int ans = 0;

        int east = 0;
        int west = 0;

        for(int i = 0; i < N; i++) {
            if(A[i] == 0) { // east
                east++;
               // ans += west;
            }
            else if(A[i] == 1) {  // west
               // west++;
                ans += east;
                if(ans > maxPassingCars)
                    return -1;
            }
        }

        return ans;
    }
}
