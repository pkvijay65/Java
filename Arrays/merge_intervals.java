/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     default constructor    Interval() { start = 0; end = 0; }
 *     parametric const.   Interval(int s, int e) { start = s; end = e; }
       }
 * }
 */

public class Solution {
    boolean checkIntersection (Interval A, Interval B){
        if (Math.min (A.end, B.end) < Math.max(A.start, B.start)){
            return false; 
        }
        else return true; 
    }
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval input) {

        int N = intervals.size();
        ArrayList<Interval> ans = new ArrayList<Interval>();

        if (N == 0){
                ans.add(input);
                return ans; 
        }

        if (input.start > intervals.get(N-1).end || input.end < intervals.get(0).start){
            if (input.end < intervals.get(0).start){
                    ans.add(input);
            }

            for (int j = 0; j<N; j++){
                    ans.add(intervals.get(j));
            }

            if (input.start > intervals.get(N-1).end){
                    ans.add(input);
                }
            return ans;
        }

        for (int i = 0; i<N; i++){
            boolean x = checkIntersection(intervals.get(i), input) ;
            
            if (!x){
                ans.add(intervals.get(i)); 
                 
                if (i < N-1 && input.start > intervals.get(i).end && input.end < intervals.get(i+1).start ){
                    ans.add(input);
                }
                continue; 
            }

            int st = i; 

            while (i < N && x){
                i++; 
                if (i == N){
                    x = false; 
                }
                else {
                    x = checkIntersection(intervals.get(i), input);
                }
            }
            i--; 

            Interval temp = new Interval(); 
            temp.start = Math.min(input.start, intervals.get(st).start);
            temp.end = Math.max(input.end, intervals.get(i).end); 
            
            ans.add(temp);

        }
        return ans;
    }
}