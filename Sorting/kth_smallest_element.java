public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int kthsmallest(final int[] A, int B) {
        int N = A.length;
        // Arrays.sort(A);
        
//solving using selection sort (watch video)
        for (int i = 0; i<B; i++){
            int smallest = i; 
            for (int j = i; j<N; j++){
                if (A[j] < A[smallest]){
                    smallest = j;
                }
            }
            int temp = A[i];
            A[i] = A[smallest];
            A[smallest] = temp; 
        }
        return A[B-1];
    }
}
