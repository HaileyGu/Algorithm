class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

        while(left <= right) {
            if(target < nums[left] || nums[left] == target) return left;
            else if(nums[right] < target) return right+1;
            else if(nums[right] == target) return right;

            int mid = left + (right-left)/2;
            if(nums[mid] == target) return mid;

            if(nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }

        return left+1;
    }
}



// class Solution {
//     public int searchInsert(int[] nums, int target) {
//         int first = 0;
//         int last = nums.length-1;
//         int middle = 0;
//
//         // find the start and end point
//         while(first+1 < last){
//             middle= first+ (last-first)/2;
//
//             if(nums[middle]==target){
//                 return middle;
//             }
//             else if(nums[middle]>target){
//                 last=middle;
//             }
//             else if(nums[middle]< target){
//                 first = middle;
//             }
//         }
//
//         if(nums[0]>=target){
//             return 0;
//         }
//         if(nums[nums.length-1]<target){
//             return nums.length;
//         }
//
//         return last;
//     }
// }
