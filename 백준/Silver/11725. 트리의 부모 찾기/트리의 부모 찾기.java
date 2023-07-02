
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
    static int[] counting;//부모노드 입력
    static ArrayList<Integer>[] arr;
    static void bfs(int idx,int n){
        boolean[] visit = new boolean[n+1];
        Queue<Integer> q = new LinkedList<>();
        q.offer(idx);
        visit[idx]=true;
        while(!q.isEmpty()){
            Integer poll = q.poll();
            ArrayList<Integer> child = arr[poll];
            for(int i=0; i<arr[poll].size(); i++){
                if(visit[child.get(i)]) continue;
                counting[child.get(i)] = poll;
                visit[child.get(i)]=true;
                q.offer(child.get(i));
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new ArrayList[n+1];
        counting = new int[n+1];
        StringTokenizer st;
        for(int i=1; i<=n; i++){
            arr[i]=new ArrayList<>();
        }
        for(int i=1; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a].add(b);
            arr[b].add(a);
//            if(!arr[a].contains(b)){
//            }
//            if(!arr[b].contains(a)){
//            }
        }
        bfs(1,n);
        StringBuilder sb = new StringBuilder();
        for (int i=2; i< counting.length; i++) {
            sb.append(counting[i]).append('\n');
        }
        System.out.println(sb);
        


    }
}

