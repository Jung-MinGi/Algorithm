import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr;
    static int n;
    static int node=0;
    static int edge=0;


    static int cnt=0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            cnt=0;
           StringTokenizer st = new StringTokenizer(br.readLine());
           node = Integer.parseInt(st.nextToken());
           edge = Integer.parseInt(st.nextToken());
           arr = new int[node+1][node+1];
           for(int i=0;i<edge;i++){
               st = new StringTokenizer(br.readLine());
               int a = Integer.parseInt(st.nextToken());
               int b = Integer.parseInt(st.nextToken());
               arr[a][b]++;
               arr[b][a]++;
           }

            boolean[] visit = new boolean[node+1];
            visit[1]=true;
            System.out.println(node-1);
        }
    }
    static void dfs(int idx,boolean[] visit){
        for(int i=1;i<=node;i++){
            if(arr[idx][i]==1&&!visit[i]){
                visit[i]=true;
                cnt++;
                dfs(i,visit);
            }
        }
    }
}


