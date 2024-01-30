import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n;
    static int k;
    static HashSet<String> set = new HashSet<>();
    static String[] arr;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        k = Integer.parseInt(br.readLine());
        arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }
        combination(new ArrayList<>(), 0);
        System.out.println(set.size());
    }

    static void combination(ArrayList<String> list, int depth) {
        if (list.size() == k) {
            boolean[] visit = new boolean[k];
            soultion(list,new String[list.size()],0,visit);
            return;
        }
        if (depth == n) return;
        combination(list, depth + 1);
        list.add(arr[depth]);
        combination(list, depth + 1);
        list.remove(list.size() - 1);
    }

    static void soultion(ArrayList<String> list, String[] str, int depth, boolean[] visit) {
        if (depth == list.size()) {
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