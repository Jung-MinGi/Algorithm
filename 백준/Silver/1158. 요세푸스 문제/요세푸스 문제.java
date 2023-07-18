import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            q.offer(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append('<');
        while(!q.isEmpty()){
            for(int i=1; i<=k; i++){
                Integer poll = q.poll();
                if(i==k && q.size()!=0){
                    sb.append(poll).append(", ");
                }else if(i==k && q.size()==0){
                    sb.append(poll).append(">");
                }else{
                    q.offer(poll);
                }
            }
        }
        System.out.println(sb);
    }
}
