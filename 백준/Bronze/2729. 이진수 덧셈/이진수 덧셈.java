import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            char[] arr = new StringBuilder(a).reverse().toString().toCharArray();
            String b = st.nextToken();
            char[] brr = new StringBuilder(b).reverse().toString().toCharArray();
            int[] answer = new int[Math.max(a.length(), b.length()) + 1];
            for (int i = 0; i < answer.length - 1; i++) {
                int tmp = answer[i];
                if (arr.length > i) tmp += arr[i] - '0';
                if (brr.length > i) tmp += brr[i] - '0';

                if (tmp == 3) {
                    answer[i + 1] = 1;
                    answer[i] = 1;
                } else if (tmp == 2) {
                    answer[i] = 0;
                    answer[i + 1] = 1;
                } else if (tmp == 1) {
                    answer[i] = 1;
                }else answer[i]=0;
            }
            boolean flag=false;
            for(int i=answer.length-1;i>=0;i--){
                if(answer[i]!=0){
                    flag=true;
                }
                if(flag) System.out.print(answer[i]);
            }
            if(!flag) System.out.print(0);
            System.out.println();
        }
    }
}
