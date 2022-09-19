public class Solution {
    void swap(int p, int q){
        int temp = p;
        p = q; 
        q = temp; 

        // p = p^q;
        // q= q^p; 
        // p = p^q;
    }

    public int firstMissingPositive(int[] A) {
        int N = A.length;

        for (int i = 0; i<N; i++){
            int element = A[i];
            int chair = element -1; 

            while ((A[i] >= 1) && (A[i] <=N) && (A[A[i] - 1] != A[i])){
                    swap(A[i], A[A[i] -1]);
            }
            // if (element >=1 && element<=N){
            //     while (A[chair] != element){
            //         swap(A[i], A[chair]);
            //     }
            // }
        }

        for (int i = 0; i<N; i++){
            if(i+1 != A[i]){
                return i+1; 
            }
        }
        return N+1; 


        // 3 2 5 -1 0 
    }
}
