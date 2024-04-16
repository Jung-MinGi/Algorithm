import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int time = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 3; i++) {
            int target = Integer.parseInt(st.nextToken());
            int attackA = a;
            int attackB = c;
            int A = b;
            int B = d;
            for (int j = 1; j < target; j++) {
                if (attackA != 0) {
                    attackA--;
                    if(attackA==0){
                        A = b;
                    }

                } else {
                    A--;
                    if(A==0){
                        attackA = a;
                    }

                }

                if (attackB != 0) {
                    attackB--;
                    if(attackB==0){
                        B = d;
                    }
                } else {
                    B--;
                    if(B==0){
                        attackB = c;
                    }
                }
            }
            if (attackA>0&&attackB>0) System.out.println(2);
            else if (attackA>0||attackB>0) System.out.println(1);
            else System.out.println(0);
        }
    }
}
/**
 * 1 2 3 4 5 6
 *
 */