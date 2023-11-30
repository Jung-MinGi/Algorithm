import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int slicePizza = Integer.parseInt(st.nextToken());
            int sliceDollar = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int wholePizza = Integer.parseInt(st.nextToken());
            int Dollar = Integer.parseInt(st.nextToken());
            if(slicePizza > Math.pow(wholePizza,2)*Math.PI){
             sb.append("Slice of pizza").append('\n');
            }else{
                sb.append("Whole pizza").append('\n');
            }
        }
        System.out.println(sb);
    }
}


