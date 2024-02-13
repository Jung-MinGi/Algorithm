import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            ArrayList<Integer> red = new ArrayList<>();
            ArrayList<Integer> black = new ArrayList<>();

            while(st.hasMoreElements())red.add(Integer.parseInt(st.nextToken()));
            st = new StringTokenizer(br.readLine());
            while(st.hasMoreElements())black.add(Integer.parseInt(st.nextToken()));
           if(a<=b){
               System.out.println("Yes");
           }else System.out.println("No");
        }
    }
}