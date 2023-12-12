import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());
       int n = Integer.parseInt(st.nextToken());
       int k = Integer.parseInt(st.nextToken());
        Queue<Integer> q = new LinkedList<>();
       for(int i=1;i<=n;i++){
           q.add(i);
       }
       int cnt=0;
       StringBuilder sb = new StringBuilder();
       sb.append("<");
        while(!q.isEmpty()){
           cnt++;
           if(cnt==k){
               Integer poll = q.poll();
               sb.append(poll);
               if(q.isEmpty()){
                   sb.append(">");
               }else{
                   sb.append(", ");
               }
               cnt=0;
           }
           else{
               Integer poll = q.poll();
               q.add(poll);
           }
       }
        System.out.println(sb);
    }

}
