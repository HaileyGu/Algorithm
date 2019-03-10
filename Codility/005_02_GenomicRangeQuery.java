import java.util.*;

class Solution {
    public int[] solution(String S, int[] P, int[] Q) {
        int N = P.length;
        Map<Integer, ArrayList<Integer>> prefSums = getPrefSum(S);

		int[] ans = new int[N];
		for (int i = 0; i < N; i++) {
			for (int j = 1; j < 5; j++) {
				int high = prefSums.get(j).get(Q[i]);
				int low = P[i]==0? 0 :prefSums.get(j).get(P[i] -1);
				if (high - low > 0) {
					ans[i]=j;
					break;
				}
			}
		}
		return ans;
    }

    public static Map<Integer,ArrayList<Integer>> getPrefSum(String s) {

		Map<Integer, ArrayList<Integer>> prefSums = new HashMap<Integer, ArrayList<Integer>>();

		for (int j = 0; j < 4; j++) {
			prefSums.put(j+1, new ArrayList<Integer>()); // 1,2,3,4
		}

		int[] counters = new int[4];
		for (int i = 0; i < s.length(); i++) {
			switch(s.charAt(i)) {
				case 'A':   counters[0]++; break;
				case 'C':   counters[1]++; break;
				case 'G':   counters[2]++; break;
				case 'T':   counters[3]++; break;
				default:    break;
			}
			for (int j = 0; j < 4; j++) {
				prefSums.get(j+1).add(counters[j]);
			}
		}
		return prefSums;
	}
}
