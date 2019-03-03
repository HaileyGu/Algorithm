class Solution {
public:
    vector<int> intersect(vector<int>& nums1, vector<int>& nums2) {
        unordered_map<int,int> mark;
        for(int i = 0; i < nums1.size(); i++) {
            mark[nums1[i]]++;
        }

        vector<int> ans;
        for(int i = 0; i < nums2.size(); i++) {
            if(mark[nums2[i]] > 0) {
                mark[nums2[i]]--;
                ans.push_back(nums2[i]);
            }
        }

        return ans;
    }
};
