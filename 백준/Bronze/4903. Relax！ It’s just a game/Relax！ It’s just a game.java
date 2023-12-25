import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(a==-1)break;

            int tmp = a + b;
            int combination = factorial(a+b)/(factorial(a)*factorial(b));
            if(tmp==combination){
                sb.append(a).append("+").append(b).append("=").append(tmp).append('\n');
            }else{
                sb.append(a).append("+").append(b).append("!=").append(tmp).append('\n');
            }
        }
        System.out.println(sb);
    }

    static int factorial(int a) {
        if (a == 1||a==0) return 1;
        return a * factorial(a - 1);
    }
}
