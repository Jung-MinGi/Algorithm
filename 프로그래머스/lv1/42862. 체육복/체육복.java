import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        //중복 값 제거
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i]==reserve[j]){
                    lost[i]=0;
                    reserve[j]=0;
                }
            }
        }
        
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(reserve[j]!=0){
                     if(lost[i]+1 ==reserve[j] ||lost[i]-1 ==reserve[j]){
                    lost[i]=0;
                    reserve[j]=0;
                    break;
                }
                }
               
            }
        }
        int cnt=0;
       for(int i=0; i<lost.length; i++){
           if(lost[i]!=0){
               cnt++;
           }
       }
        return n-cnt;
    }
}