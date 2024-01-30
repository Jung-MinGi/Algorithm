import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n;
    static int k;
    static HashSet<String> set = new HashSet<>();
    static ArrayList<String> arr;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        k = Integer.parseInt(br.readLine());
        arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(br.readLine());
        }
        soultion(arr,new String[k], 0,new boolean[n]);
        System.out.println(set.size());
    }

    static void soultion(ArrayList<String> list, String[] str, int depth, boolean[] visit) {
        if (depth == k) {
            StringBuilder sb = new StringBuilder();
            Arrays.stream(str).iterator().forEachRemaining(sb::append);
            set.add(sb.toString());
            return ;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!visit[i]) {
                visit[i] = true;
                str[depth] = list.get(i);
                soultion(list, str, depth + 1, visit);
                str[depth] = null;
                visit[i] = false;
            }
        }
    }


}