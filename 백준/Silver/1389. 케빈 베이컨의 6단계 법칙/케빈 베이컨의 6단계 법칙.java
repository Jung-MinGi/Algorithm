import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());//노드 번호
        int h = Integer.parseInt(st.nextToken());//간선 정보

        int[][] graph = new int[n+1][n+1];
        //배열 초기화
        for(int i=1; i<n+1; i++){
            Arrays.fill(graph[i],Integer.MAX_VALUE);
            graph[i][i]=0;
        }
        for(int i=0; i<h; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b]=1;
            graph[b][a]=1;
        }

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(graph[j][i]==Integer.MAX_VALUE) continue;
                for(int k=1; k<=n; k++){
                    if(graph[i][k] == Integer.MAX_VALUE) continue;
                    if(graph[j][k] > (graph[j][i]+graph[i][k])){
                        graph[j][k] = graph[j][i]+graph[i][k];
                    }
                }
            }
        }
        int sum;
        int min = Integer.MAX_VALUE;
        int answer=0;
         for(int i=1; i<=n; i++){
             sum=0;
            for(int j=1; j<=n; j++){
                sum+=graph[i][j];
            }
            if(min > sum){
                min = sum;
                answer=i;
            }

         }
        System.out.println(answer);



    }
}

