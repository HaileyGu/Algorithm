// you can use includes, for example:
// #include <algorithm>
#include <unordered_map>

// you can write to stdout for debugging purposes, e.g.
// cout << "this is a debug message" << endl;

int solution(vector<int> &A) {
    // write your code in C++14 (g++ 6.2.0)
    if(A.size() == 0) return 0;

    int ans = 0;
    int n = A.size();
    unordered_map<int,int> cnt;
    for(int i = 0; i < n; i++) {
        if(cnt.count(A[i])) cnt.erase(A[i]);
        else cnt[A[i]]++;
    }

    ans = cnt.begin()->first;
    return ans;
}
