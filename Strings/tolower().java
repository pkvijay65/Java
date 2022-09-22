public class Solution {
    public char[] to_lower(char[] A) {
        int n = A.length; 

        for (int i = 0; i<n; i++){
            if (A[i] >='A' && A[i] <='Z'){
                A[i] = (char)(A[i] + 32); 
            }
        }
        return A; 
    }
}
