// Approach #2 (Sorting) [Accepted]
// Time complexity : O(nlogn)
// Space complexity : O(1), auxiliary space if heapsort is used.
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                return true;
            }
        }
        return false;
    }
}

// Approach #3 (Hash Table) [Accepted]
// Time complexity : O(n). We do search() and insert() for n times and each operation takes constant time.
// Space complexity : O(n). The space used by a hash table is linear with the number of elements in it.
// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         HashSet<Integer> set = new HashSet<>();
//         for (int i = 0; i < nums.length; i++) {
//             if (!set.add(nums[i])) return true;
//         }
//         return false;
//     }
// }

// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         HashSet<Integer> elements = new HashSet<Integer>();

//         for(int i = 0; i < nums.length; i++) {
//             if(elements.contains(nums[i]))
//                 return true;

//             elements.add((Integer)nums[i]);
//         }

//         return false;
//     }
// }
