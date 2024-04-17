import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static char[] arr = new char[26];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 26; i++) {
            arr[i] = (char) (97 + i);
        }
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            if (a.equals("#")) break;
            String b = st.nextToken();
            String c = st.nextToken();
            System.out.print(a+" "+b+" "+c+" ");
            for (int i = 0; i < a.length(); i++) {
                int x = a.charAt(i) - 'a';
                int y = b.charAt(i) - 'a';
                int z = c.charAt(i) - 'a';
                if (x < y) {
                    int tmp = (z + y - x);
                    if(tmp>=26)tmp=tmp%26;
                    System.out.print(arr[tmp]);
                } else if (x > y) {
                    int tmp =(z+26- (x - y));
                    if(tmp>=26)tmp=tmp%26;
                    System.out.print(arr[tmp]);
                } else System.out.print(c.charAt(i));
            }
            System.out.println();
        }
    }
}
