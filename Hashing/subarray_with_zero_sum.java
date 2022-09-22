import java.util.HashSet;
public class Solution {
    public int solve(int[] A) {

        long pf[] = new long[A.length];

        pf[0] = (long)A[0];

        for (int i = 1; i < A.length; i++){
            pf[i] = pf[i-1] + A[i];
        }

        HashSet<Long> hs = new HashSet<>();

        for (int i = 0; i < A.length; i++){
            if (pf[i] == 0){
                return 1;
            }
            else if (hs.contains(pf[i])){
                return 1;
            }
            else hs.add(pf[i]);
        }

        // if (hs.contains(0l)){
        //     return 1;
        // }
        return 0;
        
    }
}
