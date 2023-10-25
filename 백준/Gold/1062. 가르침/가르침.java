import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static String[] arr;
    static boolean[] visit;
    static String[] dp;
    static int answer = Integer.MIN_VALUE;
    static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        visit = new boolean[26];
        arr = new String[n];
        for (int i = 0; i < n; i++) {
            String a = br.readLine();
            arr[i] = a.substring(4, a.length() - 4);
        }
        visit[0] = true;
        visit['n' - 'a'] = true;
        visit['t' - 'a'] = true;
        visit['i' - 'a'] = true;
        visit['c' - 'a'] = true;
        if (m < 5) {
            System.out.println(0);
            return;
        }
        dp = new String[m - 5];
        soultion(0,0);
        System.out.println(answer);

    }
    static void soultion(int depth,int idx){
        if(depth == m-5){
            int tmp=0;
            for(int i=0;i<arr.length;i++){
                boolean flag = true;
                for(int j=0;j<arr[i].length();j++){
                    if(!visit[arr[i].charAt(j)-'a']){
                        flag = false;
                        break;
                    }
                }
                if(flag) tmp++;
            }
            answer = Math.max(tmp,answer);
        }

        for(int i=idx;i<26;i++){
            if(!visit[i]){
                visit[i]=true;
                soultion(depth+1,i+1);
                visit[i]=false;
            }
        }
    }
}