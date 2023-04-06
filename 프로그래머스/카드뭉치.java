import java.util.*;
class Solution {
    public String solution(String[] cards11, String[] cards22, String[] goal) {
        String answer = "Yes";
        List<String> cards1 =  new ArrayList<>(Arrays.asList(cards11));
        List<String> cards2 =  new ArrayList<>(Arrays.asList(cards22));

        
        for(String a : goal){
	            if(cards1.indexOf(a)>=0){
	              if(cards1.indexOf(a)==0){
	            	  cards1.set(cards1.indexOf(a),"0");
	                    continue;
	                }
	              else if(cards1.get(cards1.indexOf(a)-1)!="0"){
	                answer="No";
	                   break;
	               }
	              cards1.set(cards1.indexOf(a),"0");
	            }else if(cards2.indexOf(a)>=0){
	              
	                 if(cards2.indexOf(a)==0){
	                	 cards2.set(cards2.indexOf(a),"0");
	                    continue;
	                }
	                else if(cards2.get(cards2.indexOf(a)-1)!="0"){
	                answer="No";
	                   break;
	               } cards2.set(cards2.indexOf(a),"0");
	            }
	        }
        return answer;
    }
}
