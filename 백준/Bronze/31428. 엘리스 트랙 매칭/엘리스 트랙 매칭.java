import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    // 00 10 01 11
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
       String[] arr = new String[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i]=st.nextToken();
        }
        String s = br.readLine();
        int cnt=0;
        for (String i : arr) {
            if(i.equals(s))cnt++;
        }
        System.out.println(cnt);
    }
}
