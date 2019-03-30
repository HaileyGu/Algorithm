class Solution {
public:
    bool canThreePartsEqualSum(vector<int>& A) {
        static const int x = [](){
            ios::sync_with_stdio(false);
            return 0;
        }();

        int totalSum = accumulate(A.begin(), A.end(), 0);
        if(totalSum % 3) return false;

        int sum, i = 0;
        for(int k = 0; k < 2; ++k){
            sum = 0;
            for(; i < A.size(); ++i){
                sum += A[i];
                if(sum * 3 == totalSum){
                    ++i;
                    break;
                }
            }
        }
        return k == 2 && i < A.size();
    }
};
