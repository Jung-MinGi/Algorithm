import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static int[] arr;
    public static int[] input;
    public static boolean[] visit;
    static int n;

    static int max=0;
    static int depth = 0;

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[n];
        visit = new boolean[n];
        input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }

        dfs( 0);
        System.out.println(max);
    }

    /**
     *
     * @param depth
     *
     * 3..012
     * 4..0123
     * 5..01234
     * 6..012345
     * 7..0123456
     */
    static void dfs(int depth) {
        if (depth == n) {
            int sum=0;
            for (int j=1; j<n-1; j=j+2) {
                sum += Math.abs(arr[j-1]-arr[j])+Math.abs(arr[j]-arr[j+1]);
                if(j+2==n-1&&n%2==0){
//                    System.out.println(j+2);
                    sum+=Math.abs(arr[j+1]-arr[j+2]);
                }
            }
            max = Math.max(max, sum);
            return;
        }
        for (int i = 0; i < input.length; i++) {

            if(!visit[i]){
                arr[depth]=input[i];
                visit[i]=true;
                dfs(depth+1);
                visit[i]=false;
            }
        }
    }
}