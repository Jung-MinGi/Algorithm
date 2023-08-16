import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int[] arr;
    static int low;
    static int high;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int child = Integer.parseInt(st.nextToken());
        int subin = Integer.parseInt(st.nextToken());
        arr = new int[child];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < child; i++) {
            arr[i] = Math.abs(subin-Integer.parseInt(st.nextToken()));
        }
       int idx = arr[0];
        for(int i=1; i<child; i++){
            idx = solution(idx,arr[i]);
        }
        System.out.println(idx);


    }

    static int solution(int x,int y) {
       if(x%y==0)return y;
       return solution(y,x%y);
    }
}
