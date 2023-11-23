import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int a1, b1, c1;//c는 빗변
    static int a2, b2, c2;//c는 빗변
    static int[] arr1 = new int[3];
    static int[] arr2 = new int[3];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 3; i++) {
                arr1[i] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 3; i++) {
                arr2[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            a1 = arr1[0];
            b1 = arr1[1];
            c1 = arr1[2];
            a2 = arr2[0];
            b2 = arr2[1];
            c2 = arr2[2];
            if(arr1[0]==arr2[0]&&arr1[1]==arr2[1]&&arr1[2]==arr2[2]){
                if((Math.pow(c1,2)==(Math.pow(a1,2)+Math.pow(b1,2)))
                        &&(Math.pow(c2,2)==(Math.pow(a2,2)+Math.pow(b2,2)))){
                    sb.append("YES").append('\n');
                }else{
                    sb.append("NO").append('\n');
                }
                continue;
            }
            sb.append("NO").append('\n');

        }
        System.out.println(sb);
    }
}


