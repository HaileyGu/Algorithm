class Solution {
public:
  vector<int> solution(int N, vector<int> &A) {
      // write your code in C++14 (g++ 6.2.0)
      vector<int> counters(N, 0);

      int curMin = 0;
      int curMax = 0;

      for(int i = 0; i < A.size(); i++) {

          if(A[i] <= N) {
              counters[A[i]-1] = max(curMin, counters[A[i]-1]);
              counters[A[i]-1]++;
              curMax = max(curMax, counters[A[i]-1]);
          }
          else if(A[i] == N+1) {
              curMin = curMax;
          }
      }

      for(int i = 0; i < N; i++) {
          counters[i] = max(counters[i], curMin);
      }

      return counters;
  }
};
