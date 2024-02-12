import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] arr;
    static int top = 0;
    static int bottom = 0;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] == 1) top++;
            if (arr[i] == 2) bottom++;
        }
        st = new StringTokenizer(br.readLine());
        int shirts=Integer.parseInt(st.nextToken());
        int pants=Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        for (int i : arr) {
            if (i == 1) {
                if(shirts!=0){
                    sb.append("U");
                    shirts--;
                    top--;
                }
            } else if (i == 2) {
                if(pants!=0){
                    sb.append("D");
                    pants--;
                    bottom--;
                }
            } else {
                if(shirts > pants){
                    sb.append("U");
                    shirts--;
                }else if(shirts < pants){
                    sb.append("D");
                    pants--;
                }else{//같은 경우
                    if(top>bottom){

                        sb.append("D");
                        pants--;
                    }else{
                        sb.append("U");
                        shirts--;
                    }
                }
            }
        }
if(sb.toString().length()!=n){
    System.out.println("NO");
}else{
    System.out.println("YES");
    System.out.println(sb);
}
    }
}