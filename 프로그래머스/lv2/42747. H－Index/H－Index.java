import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
       // int h=10001;
        Arrays.sort(citations);
        for(int i=citations.length-1; i>=0; i--){
            
            if(citations[i] >= answer){
                answer++;
                answer=Math.min(answer,citations[i]);
            }
        }
        return answer;
    }
}