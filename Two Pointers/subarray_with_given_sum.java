public class Solution {
    public int[] solve(int[] A, int B) {
        int n = A.length;
        int starting_pointer = 0;
        int ending_pointer = 1;
        int ans_starting_index = 0;
        int ans_ending_index = 0;

        int pf[] = new int[n];
        pf[0] = A[0];

        for (int i = 1; i<n; i++){
            pf[i] = pf[i-1] + A[i];
        }

        while (ending_pointer <n){
            if (starting_pointer == 0){
                if (pf[ending_pointer]<B){
                    ending_pointer++;
                }
                else if (pf[ending_pointer]==B){
                    ans_ending_index = ending_pointer;
                    ans_starting_index = 0;
                    break;
                }
            }

            else if (pf[ending_pointer] - pf[starting_pointer -1] == B){
                ans_starting_index = starting_pointer;
                ans_ending_index = ending_pointer;
                break;
            }
            else if (pf[ending_pointer] - pf[starting_pointer -1] <B){
                ending_pointer++;
            }
            else if (pf[ending_pointer] - pf[starting_pointer -1] >B){
                starting_pointer++;
            }
        }

        int ans[] = new int[ans_ending_index - ans_starting_index +1];

        for (int i = 0; i<ans_ending_index - ans_starting_index +1; i++){
            ans[i] = A[i + ans_starting_index];
        }
        return ans;
    }
}
