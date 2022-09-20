public class Solution {
    public int solve(int[] A) {
        int n = A.length;
        int ans = Integer.MAX_VALUE;
        int flag = 0;
        int distance;

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        for (int i = 0; i<n; i++){
            if (hm.containsKey(A[i])){
                distance = i - hm.get(A[i]);
                flag = 1;
                hm.put(A[i], i);
                ans = Math.min(ans, distance);
            }
            else hm.put(A[i], i);

        }

        return flag == 1 ? ans : -1;

    }
}
