// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int maxCounter = 0;
        int tempCounter = 0;
        int[] result = new int[N];

        for(int i = 0; i < A.length; i++) {
           // System.out.println(A[i]);
            if(A[i] == N+1) {
                maxCounter = tempCounter;
            }
            else {
                if(maxCounter > result[A[i]-1])
                    result[A[i]-1] = maxCounter;

                result[A[i]-1]++;

                if(result[A[i]-1] > tempCounter)
                    tempCounter = result[A[i]-1];

               // System.out.println(maxCounter);
            }

           // System.out.println("" + result[0]+ result[1]+ result[2]+ result[3]+ result[4]);
        }

        for(int j = 0; j < N; j++) {
            if(maxCounter > result[j])
                result[j] = maxCounter;
        }

        return result;
    }
}
