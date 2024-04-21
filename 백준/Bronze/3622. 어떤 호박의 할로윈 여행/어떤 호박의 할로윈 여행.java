import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int[] big;
        int[] small;

        if(A>B){
            big = new int[]{A,a};
            small = new int[]{B,b};
        }else{
            small = new int[]{A,a};
            big = new int[]{B,b};
        }
         if(p * 2 >= 2 *(big[0]+small[0])) System.out.println("Yes");
        else if (p * 2 >= 2 * big[0] && big[1]>=small[0]) System.out.println("Yes");
        else System.out.println("No");
    }
}
