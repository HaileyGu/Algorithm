class Solution {
public:
    int largestSumAfterKNegations(vector<int>& A, int K) {
        int N = A.size();
        sort(A.begin(), A.end());

        int idx = 0;
        while(K--) {
            A[idx] = -A[idx];

            // next?
            if(K == 0)  break; // done
            if(idx+1 == N || A[idx+1] > 0) { // all positive
                sort(A.begin(), A.end());
                idx = 0;
            }
            else if(A[idx] > 0) {
                if(A[idx+1] == 0) break; // found zero
                if(A[idx+1] < 0) idx++; // go to the next
            }
        }

        int totalSum = 0;
        for(int i = 0; i < N; i++) {
            totalSum += A[i];
        }

        return totalSum;
    }
};
