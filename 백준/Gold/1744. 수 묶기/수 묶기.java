import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> minus = new PriorityQueue<>();
        PriorityQueue<Integer> plus = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        int zero=0;
        for(int i=0; i<n; i++){
            int num = Integer.parseInt(br.readLine());
            if(num <0) minus.offer(num);
            else if(num > 0) plus.offer(num);
            else zero++;
        }
        int minusSum=0;
        int plusSum=0;
        while(!minus.isEmpty()){
            if(minus.size()==1) {
                break;
            }
            Integer a = minus.poll();
            Integer b = minus.poll();
            minusSum+=a*b;
        }
        while(!plus.isEmpty()){
            if(plus.size()==1) {
                break;
            }
            Integer a = plus.poll();
            Integer b = plus.poll();
            plusSum+=Math.max(a*b,a+b);
        }
        int ans=0;
        if(minus.size()==1 && zero>0 && plus.size()==1){
            Integer poll = minus.poll();
            Integer poll1 = plus.poll();
            if(poll + poll1 > 0){
                ans=poll+poll1;
            }
            if(ans >0){
                System.out.println(minusSum+plusSum+ans);
            }else{
                System.out.println(minusSum+plusSum+poll1);
            }
        }else if(minus.size()==1 && zero>0){
            System.out.println(minusSum+plusSum);

        }else if(minus.size()==1 && plus.size() ==1){
            Integer poll = minus.poll();
            Integer poll1 = plus.poll();
            System.out.println(minusSum+plusSum+poll+poll1);

        }else if(plus.size()==1){
            System.out.println(minusSum+plusSum+plus.poll());
        }else if(minus.size()==1){
            System.out.println(minusSum+plusSum+minus.poll());
        }else{
            System.out.println(minusSum+plusSum);
        }

    }
}