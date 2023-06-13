import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int answer=1;
        int[] hole = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            hole[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(hole);
        int init = hole[0];
        for(int i=1; i<n; i++){

            if(hole[i]-init+1>l){
                init=hole[i];//100
                answer++;
            }
        }

        System.out.println(answer);
    }
}