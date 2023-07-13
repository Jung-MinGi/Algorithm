import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][2];
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0]=Integer.parseInt(st.nextToken());
            arr[i][1]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0]==o2[0]) {
                    return o1[1]-o2[1];
                }
                else{
                    return o1[0]-o2[0];
                }
            }
        });
        int val=arr[0][0];//이어진 널빤지의 x좌표
        int answer=0;//개수
        for(int i=0; i<n; i++){
            int a = arr[i][0];
            int b = arr[i][1];
            if(val > a) {
                a = val;
            }
            else{
                val = a;
            }
            if(val >= b) continue;
            int hole = b - a;
            int k = hole / l;
            int j = hole % l;
            if(j!=0&&j <= l) k++;
            val += k*l;
            answer+=k;


        }
        System.out.println(answer);
    }

}

