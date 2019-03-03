class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> s = new HashMap<>();
        List<Integer> l = new ArrayList<Integer>();
        for (int i = 0; i < nums1.length; i++) {
            if (!s.containsKey(nums1[i])) s.put(nums1[i],1);
            else s.put(nums1[i], s.get(nums1[i])+1);
        }

        for (int i = 0; i < nums2.length; i++) {
            if(s.containsKey(nums2[i]) && s.get(nums2[i]) > 0) {
                l.add(nums2[i]);
                s.put(nums2[i], s.get(nums2[i])-1);
            }
        }

        int[] ans = new int[l.size()];
        for (int i = 0; i < l.size();i++) {
            ans[i] = l.get(i);
        }
        return ans;
      }
}
