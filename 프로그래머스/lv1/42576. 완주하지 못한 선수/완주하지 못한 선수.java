import java.util.HashMap;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer="";
        
        //map에 키를 참가자 이름, 값을 해당 키네임을 가진 사람 수
        HashMap<String,Integer> hashMap = new HashMap<>();
        for(String a:participant){
            if(hashMap.get(a) != null){
                 hashMap.put(a,hashMap.get(a)+1);
            }else{
                 hashMap.put(a,1);
            }
        }
          for(String a:completion){
            if(hashMap.get(a) > 0){
                 hashMap.put(a,hashMap.get(a)-1);
            }
        }
        for( String key : hashMap.keySet()){
            if((hashMap.get(key)) ==1){
                answer = key;
            }
        } 
        
        return answer;
    }
}