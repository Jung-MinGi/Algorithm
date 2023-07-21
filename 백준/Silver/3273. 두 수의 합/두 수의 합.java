import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[1000001];
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<n; i++){
            int a = Integer.parseInt(st.nextToken());
            arr[a] =1;
            hs.add(a);
        }
        int m = Integer.parseInt(br.readLine());
        int answer=0;
        for(int a: hs){

            if(0 < m-a && m-a <= 1000000  && arr[m-a] == 1){
             answer++;
            }
        }
        System.out.println(answer/2);
    }
}