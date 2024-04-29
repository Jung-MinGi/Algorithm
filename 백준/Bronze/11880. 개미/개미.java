import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int n =Integer.parseInt(br.readLine());
       StringBuilder sb = new StringBuilder();
       while(n-->0) {
           StringTokenizer st = new StringTokenizer(br.readLine());
           long a = Long.parseLong(st.nextToken());
           long b = Long.parseLong(st.nextToken());
           long c = Long.parseLong(st.nextToken());


           long x = (long) Math.pow(a + b, 2) + (c * c);
           long y = (long) Math.pow(a + c, 2) + (b * b);
           long z = (long) Math.pow(c + b, 2) + (a * a);
          sb.append(Math.min(x, Math.min(y,z))).append('\n');
       }
        System.out.println(sb);
    }
}

