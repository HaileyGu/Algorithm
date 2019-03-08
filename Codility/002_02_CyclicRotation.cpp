// you can use includes, for example:
// #include <algorithm>

// you can write to stdout for debugging purposes, e.g.
// cout << "this is a debug message" << endl;

vector<int> solution(vector<int> &A, int K) {
    // write your code in C++14 (g++ 6.2.0)
    int n = A.size();
    vector<int> ans(n,0);
    if(n == 0) return A;

    for(int i = 0; i < n; i++) {
        int idx = (i+K+n)%n;
        ans[idx] = A[i];
    }

    return ans;
}
