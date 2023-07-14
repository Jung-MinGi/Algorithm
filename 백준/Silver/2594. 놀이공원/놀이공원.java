import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[][] arr = new Integer[n][2];
        StringTokenizer st;
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[i][0] = ((a/100*60) + a%100)-10;
            arr[i][1] = ((b/100*60)+ b%100)+10;
        }
        Arrays.sort(arr,new Comparator<Integer[]>(){
            @Override
            public int compare(Integer[] a, Integer[] b){
                if(a[0] == b[0]){
                    return a[1]-b[1];
                }else{
                    return a[0]-b[0];
                }
            }
        });
        int max = arr[0][0] - 600;
        int pre=arr[0][1] ;
        for(int i=0; i<n-1; i++){
            int time = arr[i+1][0] - pre;
            if(time >= 0){
                pre = arr[i+1][1];
            }else{
                if(arr[i+1][1] >=pre){
                    pre = arr[i+1][1];

                }else continue;

            }
            max = Math.max(time,max);
        }
        int aa;
        if(arr[n-1][1] > pre){
            aa = 1320 - arr[n - 1][1];
        }else{
            aa=1320-pre;
        }
        int ans = Math.max(max, aa);
        if(ans ==0 ){
            System.out.println(0);
        }else{
            System.out.println(ans);
        }

    }
}