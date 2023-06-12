import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book,new Comparator<String>(){
            @Override
            public int compare(String a, String b){
                return a.compareTo(b);
            }
        });
        
        for(int i=0; i<phone_book.length-1; i++){
            for(int j=i+1; j<i+2; j++){
                if(phone_book[j].contains(phone_book[i]) && phone_book[j].indexOf(phone_book[i])==0){
                    answer = false;
                    return answer;
                }
            }
        }
    return answer;
    }
}