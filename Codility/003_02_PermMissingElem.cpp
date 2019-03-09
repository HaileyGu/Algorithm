// you can use includes, for example:
// #include <algorithm>

// you can write to stdout for debugging purposes, e.g.
// cout << "this is a debug message" << endl;

int solution(vector<int> &A) {
    // write your code in C++14 (g++ 6.2.0)

    int n = A.size();
    int ans = 0;

    int sumI = 0;
    int sumA = 0;
    for(int i = 0; i < n; i++) {
        sumI += (i+1);
        sumA += A[i];
    }
    sumI += (n+1);

    return (sumI-sumA);
}
