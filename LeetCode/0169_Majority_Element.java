class Solution {
    public int majorityElement(int[] nums) {
        int major = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                major = nums[i];
                count++;
            } else if (nums[i] != major) {
                count--;
            } else {
                count++;
            }
        }
        return major;
    }
}

// class Solution {
//     public int majorityElement(int[] nums) {
//         HashMap<Integer, Integer> cnt = new HashMap<Integer, Integer>();
//
//         for(int i = 0; i < nums.length; i++) {
//             if(cnt.containsKey(nums[i])) {
//                 cnt.put(nums[i], cnt.get(nums[i])+1);
//             } else {
//                 cnt.put(nums[i], 1);
//             }
//
//             if(cnt.get(nums[i]) >= nums.length/2+1) {
//                 return nums[i];
//             }
//         }
//
//         return -1;
//     }
// }
