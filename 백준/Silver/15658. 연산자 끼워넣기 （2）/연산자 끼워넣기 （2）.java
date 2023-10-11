import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int n;
    static Integer[] arr;
    static Integer[] operator;
    static int min=Integer.MAX_VALUE;
    static int max=Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new Integer[n];
        operator = new Integer[4];
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        operator[0]=Integer.parseInt(st.nextToken());
        operator[1]=Integer.parseInt(st.nextToken());
        operator[2]=Integer.parseInt(st.nextToken());
        operator[3]=Integer.parseInt(st.nextToken());
        dfs(arr[0],1);
        System.out.println(max);
        System.out.println(min);

    }

    static void dfs(int sum,int depth) {
        if (depth == n) {
            max = Math.max(sum,max);
            min = Math.min(min,sum);
            return;
        }
        for(int i=0; i<4; i++){
            if(operator[i]>0){
                operator[i]--;

                switch (i){
                    case 0:
                        dfs(sum+arr[depth],depth+1);
                        break;
                    case 1:
                        dfs(sum-arr[depth],depth+1);
                        break;
                    case 2:
                        dfs(sum*arr[depth],depth+1);
                        break;
                    case 3:
                        dfs(sum/arr[depth],depth+1);
                        break;
                }
                operator[i]++;
            }
        }
    }
}
