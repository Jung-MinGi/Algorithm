import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int cnt=0;
        Character midIndex='a';
        PriorityQueue<Character> left = new PriorityQueue<>();
        PriorityQueue<Character> right = new PriorityQueue<>(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return o2.compareTo(o1);
            }
        });
        for (Character character : map.keySet()) {
            if(cnt==2)break;
            if(map.get(character)==1){
                cnt++;
                midIndex=character;
                continue;
            }
            int index = map.get(character)/2;
            if(map.get(character)%2==1){
                midIndex=character;
                cnt++;
            }
            for(int i=0; i<index; i++){
                left.offer(character);
                right.offer(character);
            }
        }
        StringBuilder sb = new StringBuilder();
        if(cnt==2){
            System.out.println("I'm Sorry Hansoo");
        }else{
            while(!left.isEmpty()){
                Character poll = left.poll();
                sb.append(poll);
            }
            if(midIndex != 'a'){
                sb.append(midIndex);
            }
           while(!right.isEmpty()){
               Character pop = right.poll();
               sb.append(pop);
           }
            System.out.println(sb);
        }
    }
}

