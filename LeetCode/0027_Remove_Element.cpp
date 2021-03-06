//Approach 1: Two Pointers
//Approach 2: Two Pointers - when elements to remove are rare [v]
class Solution {
public:
    int removeElement(vector<int>& nums, int val) {

        int n = nums.size();
        int i = 0;

        while(i < n) {
            if(nums[i] == val) {
                nums[i] = nums[n-1];
                n--;
            }
            else
                i++;
        }

        return n;
    }
};
