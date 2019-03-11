import java.util.*;

class Solution {
    public int solution(String S) {
        int N = S.length();
        if(N%2 == 1) return 0;

        Stack<Character> st = new Stack<Character>();
        for(int i = 0; i < N; i++) {
            if(S.charAt(i) == '(')                          st.push('(');
            else if(S.charAt(i) == ')' && !st.isEmpty())    st.pop();
            else                                            return 0;
        }

        return (st.isEmpty())? 1 : 0;
    }
}
