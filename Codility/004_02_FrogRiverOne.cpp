// you can use includes, for example:
// #include <algorithm>
#include <unordered_map>

// you can write to stdout for debugging purposes, e.g.
// cout << "this is a debug message" << endl;

int solution(int X, vector<int> &A) {
    // write your code in C++14 (g++ 6.2.0)

    //find the earliest time
    int ans = -1;
    int n = A.size();
    unordered_map<int,bool> mark;

    for(int i = 0; i < n; i++) {
        if(A[i] <= X) {
            mark[A[i]] = true;
            if(mark.size() == X)
                return i;
        }
    }

    return ans;
}
