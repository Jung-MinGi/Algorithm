import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long cluster = 0;
        ArrayList<Long> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (n-- > 0) {
            list.add(Long.parseLong(st.nextToken()));
        }
        long size = Long.parseLong(br.readLine());
        for (long i : list) {
            cluster += (i % size == 0) ? i / size : i / size + 1;
        }
        System.out.println(size * cluster);
    }
}