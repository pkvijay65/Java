public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    int binarySearch(int [] A, int low, int high, int B){
        int mid = 0;
        while (low <= high){
            mid = (low + high) >>1; 

            if (A[mid] == B){
                 return mid; 
            }
            else if (A[mid] < B){
                low = mid + 1; 
            }
            else {
                high = mid - 1; 
            }
          }
          return -1;
    }
    public int search(final int[] A, int B) {
        int N = A.length;
        int low = 0;
        int high = N - 1; 
        int mid = 0; 

        while (low <=high){
            mid = (low + high) >>1; 

            if (A[mid] >= A[0]){
                low = mid + 1; 
            }
            else if (A[mid] <A[0]){
                high = mid - 1; 
            }
        }

        int pivot = low; 
        //for debugging
        // System.out.println(pivot + " ");

        if (A[0] <=B)  return binarySearch(A, 0, pivot -1, B);

        else return binarySearch(A, pivot, N-1, B);

    }
}
