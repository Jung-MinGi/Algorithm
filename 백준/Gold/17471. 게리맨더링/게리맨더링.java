import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static boolean[] visit;
    static int[] population;
    static int[][] map;
    static int n;
    static StringBuilder sb = new StringBuilder();
    static int total = 0;
    static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        visit = new boolean[n+1];
        population = new int[n+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            population[i] = Integer.parseInt(st.nextToken());
            total+=population[i];
        }
        map = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            for (int j = 1; j <= a; j++) {
                map[i][Integer.parseInt(st.nextToken())] = 1;
            }
        }
        for(int i=1;i<n;i++){
           ArrayList<Integer> ans = new ArrayList<>();
            recursive(ans,0,1,i);
        }
        if(answer==Integer.MAX_VALUE) System.out.println(-1);
        else System.out.println(answer);
    }

    static boolean connectionCheck(ArrayList<Integer> list){
        boolean[] check = new boolean[n+1];
        Queue<Integer> q= new LinkedList<>();
        q.add(list.get(0));
        while(!q.isEmpty()){
            Integer poll = q.poll();
            check[poll]=true;
            for(int i=1;i<=n;i++){
                if(!check[i]&&map[poll][i]==1&&list.contains(i)){
                    check[i]=true;
                    q.add(i);
                }
            }
        }
        for (Integer i : list) {
            if(!check[i])return false;
        }
        return true;
    }
    static boolean anotherConnectionCheck(ArrayList<Integer> ans){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(!ans.contains(i))list.add(i);
        }
        boolean[] check = new boolean[n+1];
        Queue<Integer> q= new LinkedList<>();
        q.add(list.get(0));
        while(!q.isEmpty()){
            Integer poll = q.poll();
            check[poll]=true;
            for(int i=1;i<=n;i++){
                if(!check[i]&&map[poll][i]==1&&list.contains(i)){
                    check[i]=true;
                    q.add(i);
                }
            }
        }
        for (Integer i : list) {
            if(!check[i])return false;
        }
        return true;
    }
    static void recursive(ArrayList<Integer> ans,int depth,int idx,int x){
        if(depth==x){
            if(connectionCheck(ans)&&anotherConnectionCheck(ans)){
                int sum1=0;
                int sum2=0;
                for(int i=1;i<=n;i++){
                    if(ans.contains(i))sum1+=population[i];
                    else sum2+=population[i];
                }
                answer = Math.min(Math.abs(sum1-sum2),answer);
            }
            return;
        }

        for(int i=idx;i<=n;i++){
            if(!visit[i]){
                visit[i]=true;
                ans.add(i);
                recursive(ans,depth+1,i+1,x);
                ans.remove(ans.get(ans.size()-1));
                visit[i]=false;
            }
        }
    }
}