import java.util.*;

class Solution {
    public int[] solution(String S, int[] P, int[] Q) {
        int N = P.length;
        int[][] prefSums = new int[S.length()][4];
        prefSums = getPrefSum(S, prefSums);

		int[] ans = new int[N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 4; j++) {
				int high = prefSums[Q[i]][j];
				int low = P[i]==0? 0 :prefSums[P[i]-1][j];
				if (high - low > 0) {
					ans[i]=j+1; // A,C,G,T
					break;
				}
			}
		}
		return ans;
    }

    public static int[][] getPrefSum(String s, int[][] prefSum) {

		for (int i = 0; i < s.length(); i++) {
			switch(s.charAt(i)) {
				case 'A':   prefSum[i][0]++; break;
				case 'C':   prefSum[i][1]++; break;
				case 'G':   prefSum[i][2]++; break;
				case 'T':   prefSum[i][3]++; break;
				default:    break;
			}
		}
		return prefSum;
	}
}
