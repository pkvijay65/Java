public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxSubArray(final int[] A) {
        int sum = 0; 
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i<A.length; i++){
            sum = sum + A[i];
            ans = Math.max(sum, ans);

            if (sum <0){
                sum = 0;
            }
        }

        return ans;
    }
}
