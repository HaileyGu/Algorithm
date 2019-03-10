class Solution {
public:
    int clumsy(int N) {

        int nums = N/4;
        int sig = (nums == 0)? 1:-1;
        int ans = 0;

        for(int i = 0; i < nums; i++) {
            if(i == 0)  ans += (1)*(N*(N-1)/(N-2))+(N-3);
            else        ans += (-1)*N*(N-1)/(N-2)+(N-3);
            N -= 4;
        }

        int rest = N%4;
        if(rest == 3)       ans += (sig)*N*(N-1)/(N-2);
        else if(rest == 2)  ans += (sig)*N*(N-1);
        else if(rest == 1)  ans += (sig)*N;

        return ans;
    }
};
