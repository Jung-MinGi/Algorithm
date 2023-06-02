import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());//역량
        int n = Integer.parseInt(st.nextToken());//최대 문제 수
        int j=n;//남은 기회
        int[][] arr = new int[k][3];
        for(int i=0; i<arr.length; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0]=Integer.parseInt(st.nextToken());
            arr[i][1]=Integer.parseInt(st.nextToken());
        }
        int answer=0;
        for(int i=0; i<k; i++){
            if(j !=0 &&arr[i][1]<=l){
                answer+=140;
                j--;
                arr[i][2]=-1;
            }
        }
        for(int i=0; i<n; i++){

            if(j !=0 && arr[i][2]!=-1 && arr[i][0]<=l){
                answer+=100;
                j--;
            }
        }
        System.out.println(answer);
    }
}