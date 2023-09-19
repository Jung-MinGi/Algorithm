import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer>[] arr;
    static boolean[] visit;
    static ArrayList<Integer> dp;
    static int n, m;
    static boolean flag = false;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());//간선정보
        dp = new ArrayList<>();
        arr = new ArrayList[n];
        visit = new boolean[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a].add(b);
            arr[b].add(a);
        }
        int a=0;
        for(int i=0; i<n; i++){
            dfs(i);
            if (flag) {
                System.out.println(1);
                return;
            }
            visit = new boolean[n];
            dp = new ArrayList<>();
        }
        System.out.println(0);
    }

    //
    static void dfs(int index) {
        visit[index] = true;
        dp.add(index);
        
        for (int i = 0; i < arr[index].size(); i++) {
            Integer a = arr[index].get(i);
            if (!visit[a]) dfs(a);
            if(flag)break;
        }
        if (dp.size() > 4) {
            int cnt = 0;
            for (int i = 0; i < dp.size(); i++) {
                for (int j = 0; j < dp.size(); j++) {
                    if (dp.get(i) == dp.get(j) && i != j) {
                        cnt++;
                    }
                }
            }
            if(cnt==0){
                flag = true;

            }
        }
        dp.remove(dp.get(dp.size() - 1));
        visit[index]=false;
    }
}