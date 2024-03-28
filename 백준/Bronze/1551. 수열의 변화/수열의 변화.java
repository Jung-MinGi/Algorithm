import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        ArrayList<Integer> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine(), ",");
        while (st.hasMoreTokens()) list.add(Integer.parseInt(st.nextToken()));
        while (b-- > 0) {
            ArrayList<Integer> tmp = new ArrayList<>();
            for (int i = 0; i < list.size() - 1; i++) {
                tmp.add(list.get(i + 1) - list.get(i));
            }
            list = new ArrayList<>();
            for (Integer i : tmp) {
                list.add(i);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Integer i : list) {
            sb.append(i).append(',');
        }
        System.out.println(sb.substring(0,sb.length()-1));
    }
}
