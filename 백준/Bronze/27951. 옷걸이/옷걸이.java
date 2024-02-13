import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int[] arr;

    static String[] answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        answer = new String[n];
        int shirt = 0;
        int pant = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        shirt = Integer.parseInt(st.nextToken());
        pant = Integer.parseInt(st.nextToken());

        for (int i=0;i<n;i++) {
            if(arr[i]==1&&shirt!=0){
                answer[i]="U";
                shirt--;
            }
            else if(arr[i]==2&&pant!=0){
                answer[i]="D";
                pant--;
            }
        }
        for (int i=0;i<n;i++) {
            if(arr[i]!=3)continue;
            if(answer[i]==null){
                if(shirt!=0){
                    answer[i]="U";
                    shirt--;
                }else if(pant!=0){
                    answer[i]="D";
                    pant--;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String s : answer) {
            if(s==null)continue;
            sb.append(s);
        }
        if(sb.toString().length()==n){
            System.out.println("YES");
            System.out.println(sb);
        }else System.out.println("NO");
    }
}