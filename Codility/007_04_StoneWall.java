// you can also use imports, for example:
import java.util.*;

class Solution {
    public int solution(int[] H) {
        int blocks = 1;
        Stack<Integer> st = new Stack<Integer>();
        st.push(H[0]);

        for(int i = 1; i < H.length; i++) {
          if(H[i] == st.peek())
            continue;
          else if(H[i] > st.peek()) {
            blocks++;
            st.push(H[i]);
          } else {
            while(!st.isEmpty() && st.peek() > H[i]) {
              st.pop();
            }
            if(st.isEmpty() || st.peek() != H[i]) {
              blocks++;
              st.push(H[i]);
            }
          }
        }

        return blocks;

    }
}
