class Solution {
public:
    string mostCommonWord(string paragraph, vector<string>& banned) {

        unordered_set<string> ban(banned.begin(), banned.end());

        unordered_map<string, int> count;

        for(int i = 0; i < paragraph.length(); i++) {
            if(isalpha(paragraph[i]))
                paragraph[i] = tolower(paragraph[i]);
            else
                paragraph[i] = ' ';
        }

        istringstream iss(paragraph);
        string w;
        pair<string, int> res("",0);
        while(iss >> w) {
            if(ban.find(w) == ban.end() && ++count[w] > res.second)
                res = make_pair(w, count[w]);
        }

        return res.first;
    }
};
