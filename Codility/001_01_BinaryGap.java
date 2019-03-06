class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        int ans = 0;

        int prev = -1;
        int i = 0;
        while(N > 0) {
            if((N & 1) == 1) {
                if(prev != -1) {
                    int gap = i-prev-1;
                    if(gap > ans) ans = gap;
                }
                prev = i;
            }
            i++;
            N = (N >> 1);
        }

        return ans;
    }
}
