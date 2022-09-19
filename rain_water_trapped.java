public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int trap(final int[] A) {
//Solution using O(1) Space
        int N = A.length;

        int l = 0;
        int r = N - 1;

        int left_max = A[0];
        int right_max = A[N-1];
        int ans = 0;

        while (l < r){

            left_max = Math.max(left_max, A[l]);
            right_max = Math.max(right_max, A[r]);

            if (left_max < right_max){
                ans += left_max - A[l];
                l++;
            }
            else {
                ans+= right_max - A[r];
                r--;
            }
        }
        return ans;

        

// Solution using O(N) Space
        // int left_max[] = new int[N];

        // left_max[0] = A[0];

        // for (int i = 1; i<N; i++){
        //     left_max[i] = Math.max(A[i], left_max[i-1]);
        // }

        // int right_max[] = new int[N];
        // right_max[N-1] = A[N-1];

        // for (int i = N-2; i>=0; i--){
        //     right_max[i] = Math.max(A[i], right_max[i+1]);
        // }

        // int ans = 0;
        // int total_water = 0;

        // for (int i = 1; i<N-1; i++){
          
        //     ans = Math.min(left_max[i], right_max[i]);

        //     total_water += ans - A[i];
        // }

        // return total_water;
    }
}
