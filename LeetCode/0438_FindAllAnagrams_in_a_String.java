class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<Integer>();
        int[] dict = new int[26];
        char[] pc = p.toCharArray();
        char[] sc = s.toCharArray();

        int SLen = s.length();
        int PLen = p.length();

        int count = 0;
        for (char c : pc) {
            if (dict[c - 'a'] == 0) count++;
            dict[c - 'a']++;
        }

        for (int i = 0; i < SLen; i++) {
            char r = sc[i];
            if (dict[r - 'a'] == 1) count--;
            dict[r - 'a']--;

            if (i >= PLen) {
                char l = sc[i - PLen];
                if (dict[l - 'a'] == 0) count++;
                dict[l - 'a']++;
            }

            if (count == 0) {
                ans.add(i - PLen + 1);
            }
        }

        return ans;
    }
}
