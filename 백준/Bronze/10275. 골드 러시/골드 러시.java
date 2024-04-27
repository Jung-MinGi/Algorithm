import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while(n-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            long c = Long.parseLong(st.nextToken());
            a = (long)Math.pow(2,a);

            int day=0;
            while(true){
                if(a<=b){
                    b-=a;
                    if(b==0){
                        System.out.println(day);
                        break;
                    }
                    a=a/2;
                }else{
                    a=a/2;
                }
                day++;


            }
        }
    }
}
/*
512  256  128 64 32 16 16

 */
