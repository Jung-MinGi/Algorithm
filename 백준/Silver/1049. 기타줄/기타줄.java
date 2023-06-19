import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[m][2];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]){
                    return o1[1]-o2[1];
                }
                return o1[0] - o2[0];
            }
        });
        int lowPackage = arr[0][0];
        int a=n/6;
        if(n%6 != 0){
            a +=1;
        }
        int min1 = arr[0][0] * a;//패키지ㅣ로만 구매
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]){
                    return o1[0]-o2[0];
                }
                return o1[1] - o2[1];
            }
        });
            //패키지,낱개 조합
        int min2 = (lowPackage*(n/6)) + (arr[0][1]*(n%6));
        //낱개로만 구매
        int min3 = arr[0][1]*n;
        System.out.println(Math.min(Math.min(min1,min2),min3));

    }
}