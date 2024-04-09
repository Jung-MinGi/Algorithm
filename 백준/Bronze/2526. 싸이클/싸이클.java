import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        int n = Integer.parseInt(st.nextToken());
        int a=n;
        int p = Integer.parseInt(st.nextToken());
        while (!list.contains(a)) {
            list.add(a);
            a = (a * n) % p;
        }
        System.out.println(list.size()-list.indexOf(a));
    }
}
