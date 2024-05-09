import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static char[][] chess = {
            {},
            {'a','b', 'w', 'b', 'w', 'b', 'w', 'b', 'w'},
            {'a','w', 'b', 'w', 'b', 'w', 'b', 'w', 'b'},
            {'a','b', 'w', 'b', 'w', 'b', 'w', 'b', 'w'},
            {'a','w', 'b', 'w', 'b', 'w', 'b', 'w', 'b'},
            {'a','b', 'w', 'b', 'w', 'b', 'w', 'b', 'w'},
            {'a','w', 'b', 'w', 'b', 'w', 'b', 'w', 'b'},
            {'a','b', 'w', 'b', 'w', 'b', 'w', 'b', 'w'},
            {'a','w', 'b', 'w', 'b', 'w', 'b', 'w', 'b'}
    };

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while (n-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            char color = chess[s.charAt(1) - '0'][s.charAt(0) - 'A'+1];
           int a = Integer.parseInt(st.nextToken());
            if(a%8==0){

            }
            if(color==chess[((a%8)==0)?a/8:a/8+1][((a%8)==0?8:a%8)]){
                System.out.println("YES");
            }else System.out.println("NO");
        }
    }

}
