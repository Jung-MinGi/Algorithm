import java.util.Arrays;
class Solution {
    public String solution(int[] numbers) {
        // String answer = "";
        String[] arr = new String[numbers.length];
        for(int i=0; i<arr.length; i++){
            arr[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(arr,(a,b)->(b+a).compareTo(a+b));
        
            if(arr[0].equals("0")){
                return "0";
            }
        StringBuilder sb = new StringBuilder();
        for(String a:arr){
            sb.append(a);
        }
        return sb.toString();
    }
}