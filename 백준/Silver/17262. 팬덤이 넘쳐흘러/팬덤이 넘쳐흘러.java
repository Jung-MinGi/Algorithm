import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer[]> list = new ArrayList<>();
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            list.add(new Integer[]{Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())});
        }
        Collections.sort(list, (Integer[] a, Integer[] b) -> a[0] - b[0]);
        int start = list.get(0)[1];
        int end = list.get(list.size() - 1)[0];
        for (Integer[] integers : list) {
            if (integers[1] < start) {
                start = integers[1];
            }
            if (integers[0] > end) {
                end = integers[0];
            }
        }
        if(start>end) System.out.println(0);
        else System.out.println(end - start);
        
    }
}