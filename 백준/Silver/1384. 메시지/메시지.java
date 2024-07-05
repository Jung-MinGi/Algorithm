import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int i = 1; ; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            sb.append("Group ").append(i).append('\n');
            String[] name = new String[n];
            String[][] msg = new String[n][n - 1];
            for (int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                name[j] = st.nextToken();
                for (int k = 0; k < n - 1; k++) {
                    msg[j][k] = st.nextToken();
                }
            }
            boolean flag = false;
            for (int j = 0; j < name.length; j++) {
                ArrayList<String> list = new ArrayList<>();
                for (int k = n - 2; k >= 0; k--) {
                    if (msg[j][k].equals("N")) {
                        flag = true;
                        int len = n - 1 - k;//3
                        list.add(name[(j + len) % n] + " was nasty about " + name[j] + '\n');
                    }
                }
                if (!list.isEmpty()) {
                    for (int k = list.size() - 1; k >= 0; k--) {
                        sb.append(list.get(k));
                    }
                }

            }
            if (!flag) sb.append("Nobody was nasty").append('\n');
            sb.append('\n');
        }

        System.out.print(sb);
    }
}
