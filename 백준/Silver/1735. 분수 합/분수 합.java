import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int child = (n * b) + (a * m);
        int parent = m * b;
        int gcd = gcd(child, parent);
        if(gcd==1){
            System.out.println(child+" "+parent);
        return;
        }
        while(child%gcd==0&&parent%gcd==0){
            child=child/gcd;
            parent=parent/gcd;
        }
        System.out.println(child+" "+parent);
    }

    static int gcd(int a, int b) {
        if (a % b == 0) return b;
        return gcd(b, a % b);
    }
}
