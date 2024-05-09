import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static char[][] a;
private static int x=2040000;
private static int y=1530000;
private static int z=1020000;
private static int t=510000;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        a = new char[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                int q = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());
                char s;
                int intensity = intensity(q, b, c);
                if(intensity>=x)s='.';
                else if(intensity>=y)s='-';
                else if(intensity>=z)s='+';
                else if(intensity>=t)s='o';
                else s='#';
                a[i][j]=s;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char[] chars : a) {
            for (char aChar : chars) {
                sb.append(aChar);
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }

    static int intensity(int a, int b, int c) {
       return (a * 2126 + b * 7152 + c * 722);
    }
}
