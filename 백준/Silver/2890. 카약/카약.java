import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;


public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        ArrayList<int[]> rank = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            int cnt = 0;
            boolean flag = false;
            int k = -1;
            for (int j = m - 2; j > 0; j--) {
                if (s.charAt(j) == '.') cnt++;
                else {
                    flag = true;
                    k = s.charAt(j) - '0';
                    break;
                }
            }
            if (flag) rank.add(new int[]{cnt, k});
        }
        int[] answer = new int[10];
        Collections.sort(rank, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        answer[rank.get(0)[1] - 1] = 1;
        int r = 1;
        for (int i = 1; i < rank.size(); i++) {
            if (rank.get(i - 1)[0] != rank.get(i)[0]) {
                r++;
            }
            answer[rank.get(i)[1] - 1] = r;
        }
        for (int i = 0; i < answer.length - 1; i++) {
            System.out.println(answer[i]);
        }
    }
}