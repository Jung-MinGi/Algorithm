import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static boolean[] visit;
    static int[] sour;
    static int[] salt;
    static int n;
    static StringBuilder sb = new StringBuilder();
    static int answer = 1000000000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        sour = new int[n];
        salt = new int[n];
        visit = new boolean[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            sour[i] = Integer.parseInt(st.nextToken());//신맛
            salt[i] = Integer.parseInt(st.nextToken());//짠맛
            answer = Math.min(answer, Math.abs(sour[i] - salt[i]));
        }

        for (int i = 2; i <= n; i++) {
            int[] arr = new int[i];
            recursive(0,0,arr);
        }
        System.out.println(answer);
    }

    static void recursive(int depth, int idx, int[] arr) {
        if (depth == arr.length) {
            int x=1;
            int y=0;
            for (int i : arr) {
                x=x*sour[i];
                y=y+salt[i];
                answer = Math.min(Math.abs(x-y),answer);
            }
            return;
        }

        for (int i = idx; i < n; i++) {
            if(!visit[i]){
                visit[i]=true;
                arr[depth]=i;
                recursive(depth+1,i+1,arr);
                visit[i]=false;
                arr[depth]=0;
            }
        }
    }
}