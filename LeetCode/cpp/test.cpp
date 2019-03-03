class Solution {
public:
    vector<string> commonChars(vector<string>& A) {
        int N = A.size();

        int cnt[26] ={0,};
        for(int j = 0; j < A[0].length(); j++)
            cnt[A[0][j]-'a']++;

        for(int i = 1; i < N; i++) {
            int num[26] = {0,};

            for(int j = 0; j < A[i].length(); j++) {
                if(cnt[A[i][j]-'a'] > 0) {
                    cnt[A[i][j]-'a']--;
                    num[A[i][j]-'a']++;
                }
            }

            for(int i = 0; i < 26; i++)
                cnt[i] = num[i];
        }

        vector<string> ans;
        for(int i = 0; i < 26; i++) {
            while(cnt[i]-- > 0) {
                string ch;
                ch += char('a'+i);
                ans.push_back(ch);
            }
        }

        return ans;
    }
};
