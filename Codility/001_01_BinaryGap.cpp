// java version is better

// you can use includes, for example:
// #include <algorithm>
#include <vector>

// you can write to stdout for debugging purposes, e.g.
// cout << "this is a debug message" << endl;

int solution(int N) {
    // write your code in C++14 (g++ 6.2.0)

    vector<int> onedigit;
    vector<int> allonedigit;
    int N2 = N+1;

    int ans = 0;

    for(int i = 0; i < 32; i++) {
        if((N &(1 << i)) > 0) {
            // cout << i << ", ";
            onedigit.push_back(i);
        }

        if((N2 &(1 << i)) > 0) {
            // cout << i << ", ";
            allonedigit.push_back(i);
        }
    }
    // cout << endl;

    if(allonedigit.size() == 0 || onedigit.size() == 0)
        return 0;

    for(int i = 1; i < onedigit.size(); i++) {
        ans = max(ans, onedigit[i]-onedigit[i-1]-1);
    }

    return ans;
}
