import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Long n = Long.parseLong(st.nextToken());
        Long k = Long.parseLong(st.nextToken());
        Queue<Long> q = new LinkedList<>();
        HashSet<Long> visited = new HashSet<>();
        q.offer(n);
        visited.add(n);
        int count=0;
        Long a=0L;
        Long b=0L;
        Long temp=-1L;
        while(!q.isEmpty()){
            int size = q.size();
             for(int i=0; i<size; i++){
                Long poll = q.poll();
                if(!q.contains(poll)){
                    a = poll*2;
                    b = (poll*10)+1;
                    if(!visited.contains(a) && a <= k){
                           if(a.compareTo(k)==0){
                            temp=a;
                        }
                           visited.add(a);
                        q.offer(a);
                    }if(!visited.contains(b)&& b <= k){
                        if(b.compareTo(k)==0){
                              temp=b;
                        }
                        visited.add(b);
                        q.offer(b);
                    }

                }
        }
            count=count+1;
            if(q.contains(k)){
                break;
            }
        }
        if(temp.compareTo(k)==0){
            System.out.println(count+1);
        }else{
            System.out.println(-1);
        }

    }
}

