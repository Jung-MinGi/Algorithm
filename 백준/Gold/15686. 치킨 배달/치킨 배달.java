import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int n, m;
    static Integer[][] arr;
    static int answer=Integer.MAX_VALUE;
    static int[] dp;
    static boolean[] visit;
    static ArrayList<int[]> home = new ArrayList<>();
    static ArrayList<int[]> chicken = new ArrayList<>();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new Integer[n][n];
        dp = new int[m];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                Integer a = arr[i][j];
                if(a==1) home.add(new int[]{i,j});
                else if(a==2) chicken.add(new int[]{i,j});
            }
        }
        visit = new boolean[chicken.size()];
        back(0,0);
        System.out.println(answer);
    }

    static void back(int idx, int depth) {
        if (depth == m) {
            int sum=0;
            for (int[] ints : home) {
                int len=Integer.MAX_VALUE;
                for (int k : dp) {
                    int a = Math.abs(ints[0] - chicken.get(k)[0]) + Math.abs(ints[1] - chicken.get(k)[1]);
                    len = Math.min(a,len);
                }
                sum += len;
            }
            answer=Math.min(answer,sum);
            return;
        }

        for(int i=idx; i< chicken.size(); i++){
            if(!visit[i]){
                visit[i]=true;
                dp[depth]=i;
                back(i+1,depth+1);
                visit[i]=false;
            }
        }
    }
}