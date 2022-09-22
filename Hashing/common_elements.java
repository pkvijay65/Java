import java.io.*;
import java.util.*;
public class Solution {
    public int[] solve(int[] A, int[] B) {
        HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();

        for (int i = 0; i<A.length; i++){
            if (hs.containsKey(A[i])){
                hs.put(A[i], hs.get(A[i]) + 1);
            }
            else hs.put (A[i], 1);
        }

        ArrayList<Integer> ans = new ArrayList<Integer>();

        for (int i = 0; i<B.length; i++){
            if (hs.containsKey(B[i]) && hs.get(B[i]) >0 ){
                hs.put(B[i], hs.get(B[i]) - 1);
                ans.add(B[i]);
            }
        }
        int N = ans.size();

        int result[] = new int[N];

        for (int i = 0; i<N; i++){
            result[i] = ans.get(i); 
        }
        return result;


    }
}
