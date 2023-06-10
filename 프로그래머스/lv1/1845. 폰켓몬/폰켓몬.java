import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int answer=0;
        HashSet<Integer> hs = new HashSet<>();
        for(int a:nums){
            hs.add(a);
        }
        //n/2와 포켓몬 종류의 개수 비교
        int n = nums.length/2;
        
        if(n <= hs.size()){
            answer = n;
        }else{
            answer = hs.size();
        }
    
        return answer;
    }
    
}