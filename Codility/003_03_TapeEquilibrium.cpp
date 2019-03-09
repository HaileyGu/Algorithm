// you can use includes, for example:
// #include <algorithm>
#include <vector>
#include <algorithm>
// you can write to stdout for debugging purposes, e.g.
// cout << "this is a debug message" << endl;

int solution(vector<int> &A) {
    // write your code in C++14 (g++ 6.2.0)
    int gap = 0;
    int tempGap = 0;
    int N = A.size();

    int left = A[0];
    int right = A[1];
    for(int i = 2; i < N; i++) {
        right += A[i];
    }

    gap = abs(left-right);
    for(int i = 1; i < N-1; i++) {
        left += A[i];
        right -= A[i];
        tempGap = abs(left-right);
        if(tempGap < gap)
            gap = tempGap;
    }


    return gap;
}
