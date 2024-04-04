import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());
       int a = Integer.parseInt(st.nextToken());
       int b = Integer.parseInt(st.nextToken());
       int c = Integer.parseInt(st.nextToken());
       int d = Integer.parseInt(st.nextToken());
        if(a==b&&a==c&&a==d){
            System.out.println(a*c);
        }else if(a==b&&b==c){
            System.out.println(a*d);
        }else if (a==b&&b==d){
            System.out.println(a*c);
        }else if (a==c&&d==c){
            System.out.println(a*b);
        }else if (c == b){
            System.out.println(a*b);
        }else if(a==b){
            System.out.println(a*c);
        }else if(a==c){
            System.out.println(a*b);
        }else if(a==d){
            System.out.println(a*b);
        }else if(b==c){
            System.out.println(a*c);
        }else if(b==d){
            System.out.println(a*b);
        }else if(c==d){
            System.out.println(a*c);
        }else{
            ArrayList<Integer> list = new ArrayList<>();
            list.add(a);
            list.add(b);
            list.add(c);
            list.add(d);
            Collections.sort(list);
            System.out.println(list.get(0)*list.get(2));
        }
    }
}

