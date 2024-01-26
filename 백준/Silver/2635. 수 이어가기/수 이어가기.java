import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static boolean[] visit;
    static int[][] arr;
    static int n;
    static StringBuilder sb = new StringBuilder();
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        list.add(n);
        for (int i = n; i > 0; i--) {
            list.add(i);
            recursive(list);
            list.remove(list.size() - 1);
        }
        System.out.println(answer);
        System.out.println(sb);
    }

    static void recursive(ArrayList<Integer> list) {

        int x = list.get(list.size() - 2) - list.get(list.size() - 1);
        if (x < 0) {
            if (list.size() > answer) {
                answer = Math.max(list.size(), answer);
                sb.delete(0,sb.length());
                for (Integer i : list) {
                    sb.append(i).append(' ');
                }
            }
            return;
        }

        list.add(x);
        recursive(list);

        list.remove(list.size() - 1);
    }
}