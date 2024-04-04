import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringBuilder sb = new StringBuilder();
        while(true){
            int n =Integer.parseInt(br.readLine());
            if(n==0)break;
            ArrayList<String> list = new ArrayList<>();
            while(n-->0)list.add(br.readLine());
            Collections.sort(list, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    String x=o1.toLowerCase();
                    String y=o2.toLowerCase();
                    return x.compareTo(y);
                }
            });
            sb.append(list.get(0)).append('\n');
        }
        System.out.println(sb);
    }
}

