class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> result;
        unordered_map<int,int> hashTable;

        for(int i = 0; i < nums.size(); i++) {
            int numberToFind = target-nums[i];
            if(hashTable.find(numberToFind) != hashTable.end()) {
                result.push_back(i);
                result.push_back(hashTable[numberToFind]);
                return result;
            }

            hashTable[nums[i]] = i;
        }


        return result;
    }
};
