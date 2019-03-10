class Solution {
public:

    // 2,1 , 222222222
    // 1,2

    // 2,1
    // 1,2 , 222222222

    // 2,1 , 111111111
    // 1,2

    // 2,1
    // 1,2 , 111111111


    int minDominoRotations(vector<int>& A, vector<int>& B) {
        int N = A.size();
        int ans[4] = {0,};
        bool fail[4] = {0, };

        int baseNum[4];
        baseNum[0] = A[0];
        baseNum[1] = A[N-1];
        baseNum[2] = B[0];
        baseNum[3] = B[N-1];

        int answer = INT_MAX;

        for(int i = 0; i < A.size()-1; i++) {
            for(int j = 0; j < 4; j++) {
                if(!fail[j]) {
                    int firstTarget, secondTarget;
                    if(j == 0)      { firstTarget = A[i+1];         secondTarget = B[i+1];      }
                    else if(j == 1) { firstTarget = A[N-1-(i+1)];   secondTarget = B[N-1-(i+1)];}
                    else if(j == 2) { firstTarget = B[i+1];         secondTarget = A[i+1];      }
                    else if(j == 3) { firstTarget = B[N-1-(i+1)];   secondTarget = A[N-1-(i+1)];}

                    if(baseNum[j] == firstTarget) {
                        ;
                    }
                    else if(baseNum[j] == secondTarget) {
                        ans[j]++;
                    }
                    else {
                        fail[j] = true;
                        ans[j] = INT_MAX;
                    }
                }
            }

            if(fail[0] && fail[1] && fail[2] && fail[3]) {
                return -1;
            }

        }

        return min(min(ans[0], ans[1]), min(ans[2], ans[3]));

    }
};
