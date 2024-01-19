import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static boolean[][] badCombination = new boolean[201][201];
    static int n;
    static int m;
    static boolean[] visit;
    static int answer = 0;
    static int[] choice = new int[3];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            badCombination[a][b] = true;
            badCombination[b][a] = true;
        }
        visit = new boolean[n + 1];

            combination(1, 0);
        System.out.println(answer);
    }

    static void combination(int idx,int depth) {
        if (depth == 3) {
            answer++;
            return;
        }
        for (int i = idx; i <= n; i++) {
            boolean flag = false;
           if(visit[i])continue;
            for (int a : choice) {
                if(a==0)continue;
                if(badCombination[i][a]){
                    flag=true;
                    break;
                }
            }
            if(flag)continue;
            visit[i]=true;
            choice[depth]=i;
            combination(i+1,depth+1);
            visit[i]=false;
            choice[depth]=0;
        }
    }
}

