import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Deque<Integer> deque;
        Integer[] arr;
        StringBuilder sb = new StringBuilder();
        while(n-->0){
            int k = Integer.parseInt(br.readLine());
            arr = new Integer[k];
            st = new StringTokenizer(br.readLine());
            for(int i=0; i<k; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2-o1;
                }
            });
            deque = new ArrayDeque<>();
            for(int i=0; i<k; i++){
                if(i%2==0){
                    deque.addLast(arr[i]);
                }else{
                    deque.addFirst(arr[i]);
                }

            }
            int  max = Integer.MIN_VALUE;
            for(int i=0; i<k; i++){
                arr[i]=deque.pollFirst();
            }
            for(int i=0; i<k-1; i++){
                max=Math.max(Math.abs(arr[i]-arr[i+1]),max);
            }
            max=Math.max(Math.abs(arr[0]-arr[arr.length-1]),max);
            sb.append(Math.abs(max)).append('\n');
        }
        System.out.println(sb);
    }
}