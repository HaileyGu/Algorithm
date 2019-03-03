class Solution {
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8

      int[] counters = new int[N];

  		int currMax = 0;
  		int currMin = 0;

  		for (int i = 0; i < A.length; i++) {

  			if (A[i] <= N) {
  				counters[A[i]-1] = Math.max(currMin, counters[A[i]-1]);
  				counters[A[i]-1]++;
  				currMax = Math.max(currMax, counters[A[i]-1]);
  			}
  			else if (A[i] == N+1) {
  				currMin= currMax;
  			}
  		}

  		for (int i = 0; i < counters.length; i++) {
  			counters[i] = Math.max(counters[i], currMin);
  		}

  		return counters;
    }
}
