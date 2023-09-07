import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {

    static Integer[] arr;
    static Integer[] dp;
    static boolean[][] visit;
    static StringTokenizer st;
    static StringBuilder sb;
    static int rowMax = 1;
    static int colMax = 1;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        dp = new Integer[3];
        for(int i=0; i<3; i++){
            dp[i]=Integer.parseInt(st.nextToken());
        }
        arr = new Integer[3];
        Arrays.fill(arr,1);
        int answer=1;
        while(true){
            if(arr[0]==dp[0] && arr[1]==dp[1]&& arr[2]==dp[2]){
                break;
            }
            answer++;
            if(arr[0]+1>15) arr[0]=1;
            else arr[0]+=1;

            if(arr[1]+1>28) arr[1]=1;
            else arr[1]+=1;

            if(arr[2]+1>19) arr[2]=1;
            else arr[2]+=1;
        }
        System.out.println(answer);
    }
}

