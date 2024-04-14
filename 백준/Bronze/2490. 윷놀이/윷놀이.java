import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    //배 0
    //등 1
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<3;i++){
            int a=0;//등
            int b=0;//배
            StringTokenizer st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                int n = Integer.parseInt(st.nextToken());
                if(n==0)b++;
                else a++;
            }
            if(a==4) System.out.println("E");
            else if(b==4) System.out.println("D");
            else if(a==1) System.out.println("C");
            else if(a==2) System.out.println("B");
            else System.out.println("A");
        }
    }
}
