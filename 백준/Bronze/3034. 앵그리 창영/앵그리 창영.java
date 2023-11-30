import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        double c = Math.pow(x,2)+Math.pow(y,2);
        for(int i=0;i<n;i++){
            int len = Integer.parseInt(br.readLine());
            if(len<=x||len<=y||Math.pow(len,2)<=c){
                System.out.println("DA");
            }else{
                System.out.println("NE");
            }
        }
    }
}


