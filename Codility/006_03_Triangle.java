// you can also use imports, for example:
 import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
		if (A.length < 3)
			return 0;
		Arrays.sort(A);

		for (int i = 2; i < A.length; i++) {
			if ((long)A[i-2] + (long)A[i-1] > (long)A[i])
				return 1;
		}

		return 0;
    }
}
