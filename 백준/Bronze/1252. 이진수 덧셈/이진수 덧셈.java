import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    static int[] answer = new int[81];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a =soultion(st.nextToken());
        String b = soultion(st.nextToken());
        int[] arr = new int[80];
        for (int i = a.length() - 1; i >= 0; i--) {
            arr[a.length() - i - 1] = a.charAt(i) - '0';
        }
        int[] brr = new int[80];
        for (int i = b.length() - 1; i >= 0; i--) {
            brr[b.length() - i - 1] = b.charAt(i) - '0';
        }
        for (int i = 0; i < Math.max(a.length(), b.length()); i++) {
            int tmp = arr[i] + brr[i]+answer[i];
            if (tmp == 2) {
                answer[i + 1] = 1;
                answer[i] = 0;
            }else if(tmp==3){
                answer[i + 1] = 1;
                answer[i] = 1;
            }
            else if (tmp == 1) answer[i] = 1;
            else answer[i] = 0;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 80; i >= 0; i--) {
            if (answer[i] != 0) {
                for (int j = i; j >= 0; j--) sb.append(answer[j]);
                break;
            }
        }
        if (sb.length() == 0) System.out.println(0);
        else System.out.println(sb);
    }

    static String soultion(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '0') {
                for (int j = i; j <s.length(); j++) sb.append(s.charAt(j));
                break;
            }
        }
        return sb.toString();
    }
}
