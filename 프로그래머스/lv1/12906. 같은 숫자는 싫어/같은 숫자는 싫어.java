import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
       
        List<Integer> list = new ArrayList<>();
        if(arr.length>1){
            for(int i=0; i<arr.length; i++){
                if(i==0 ||arr[i] != arr[i-1]){
                list.add(arr[i]);
                }
            }
        }else{
            list.add(arr[0]);
        }
       int[] answer = new int[list.size()];
       for(int i=0; i<list.size(); i++){
           answer[i]=list.get(i);
       }
        

        return answer;
    }
}