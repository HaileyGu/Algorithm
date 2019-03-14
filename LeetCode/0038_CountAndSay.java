
// Runtime : 1ms
class Solution {
    public String countAndSay(int n) {
        String s = "1";
        while (n-- > 1) s = say(s);
        return s;

    }
    private String say(String s) {
        if (s.length() == 0) return "";
        StringBuilder sb = new StringBuilder();
        char[] ss = s.toCharArray();
        char target = ss[0];
        int cnt = 0;

        for (char cur : ss) {
            if (cur == target) cnt++;
            else {
                sb.append(cnt);
                sb.append(target);
                cnt = 1;
                target = cur;
            }
        }
        sb.append(cnt);
        sb.append(target);
        return sb.toString();

    }
}

// Runtime : 2ms
// class Solution {
//     public String countAndSay(int n) {
//         StringBuilder curr = new StringBuilder("1");
//         StringBuilder prev;
//         int count;
//         char say;

//         for(int i = 1; i < n; i++) {
//             prev = curr;
//             curr = new StringBuilder();
//             count = 1;
//             say = prev.charAt(0);

//             for(int j = 1; j < prev.length(); j++) {
//                 if(prev.charAt(j) != say) {
//                     curr.append(count).append(say);
//                     count = 1;
//                     say = prev.charAt(j);
//                 }
//                 else
//                     count++;
//             }
//             curr.append(count).append(say);
//         }

//         return curr.toString();
//     }
// }
