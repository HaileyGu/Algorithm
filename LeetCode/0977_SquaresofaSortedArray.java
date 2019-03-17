// Approach 1: Sort
// Time Complexity: O(NlogN), where N is the length of A.
// Space Complexity: O(N)

// class Solution {
//     public int[] sortedSquares(int[] A) {
//         int N = A.length;
//         int[] ans = new int[N];
//         for (int i = 0; i < N; ++i)
//             ans[i] = A[i] * A[i];

//         Arrays.sort(ans);
//         return ans;
//     }
// }


// Approach 2: Two Pointer
// Time Complexity: O(N), where N is the length of A.
// Space Complexity: O(N)

class Solution {
    public int[] sortedSquares(int[] A) {
        int N = A.length;
        int j = 0;
        while (j < N && A[j] < 0)
            j++;
        int i = j-1;

        int[] ans = new int[N];
        int t = 0;

        while (i >= 0 && j < N) {
            if (A[i] * A[i] < A[j] * A[j]) {
                ans[t++] = A[i] * A[i];
                i--;
            } else {
                ans[t++] = A[j] * A[j];
                j++;
            }
        }

        while (i >= 0) {
            ans[t++] = A[i] * A[i];
            i--;
        }
        while (j < N) {
            ans[t++] = A[j] * A[j];
            j++;
        }

        return ans;
    }
}


// class Solution {
//     public int[] sortedSquares(int[] A) {
//         if (A == null || A.length == 0)
//             return A;

//         int [] res = new int[A.length];
//         int i = A.length - 1, j = 0, k = A.length - 1;
//         while (k >= 0) {
//             if (Math.abs(A[j]) < Math.abs(A[i])) {
//                 res[k] = A[i] * A[i];
//                 i--;
//             } else {
//                 res[k] = A[j] * A[j];
//                 j++;
//             }
//             k--;
//         }
//         return res;
//     }
// }
