import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
         List<Integer> answer = new ArrayList<>();
           //약관 매핑 
        HashMap<String,Integer> term = new HashMap<>();
        for(int i=0; i<terms.length; i++){
            term.put(String.valueOf(terms[i].charAt(0)),
                     Integer.parseInt(terms[i].substring(2))*28);
        }
        
        int today2 = day(today.substring(0,4),today.substring(5,7)
                         ,today.substring(8));
        int cnt=1;
        for(int i=0; i<privacies.length; i++){
           
            int tempDay = day(privacies[i].substring(0,4),privacies[i].substring(5,7)
                         ,privacies[i].substring(8,10));
            
           
            if(compareDay(today2,tempDay,term.get(privacies[i].substring(11)))){
                answer.add(i+1);
                
            }
           
        }
         int[] result = new int[answer.size()];
            for(int i=0; i<answer.size(); i++) {
        	result[i] = answer.get(i);
        }
    
        return result;
        }
        //day로 변환 함수
    static int day(String year1,String month1,String day1){
        int year = Integer.parseInt(year1);
        int month = Integer.parseInt(month1);
        int day2 = Integer.parseInt(day1);
        return (((year*12)+month)*28)+day2;
    }
        //현재 날짜와 비교
    static boolean compareDay(int today,int temp,int value){
        int a = temp + value;
        if(today>=a){
            return true;
        }
        return false;
    }
      
    
}