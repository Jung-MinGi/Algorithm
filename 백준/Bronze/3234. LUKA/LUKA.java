import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    static HashSet<String> set = new HashSet<>();

    static int[] dx = new int[]{0, 0, 1, 1, 1, 0, -1, -1, -1};
    static int[] dy = new int[]{0, 1, 1, 0, -1, -1, -1, 0, 1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int lukaX = Integer.parseInt(st.nextToken());
        int lukaY = Integer.parseInt(st.nextToken());
        for (int i = 0; i < dx.length; i++) {
            int nx = dx[i] + lukaX;
            int ny = dy[i] + lukaY;
            set.add(String.valueOf(nx) + ny);
        }
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int x = 0;
        int y = 0;
        StringBuilder sb = new StringBuilder();
        if (set.contains(String.valueOf(x) + y)) sb.append(0).append('\n');
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            switch (c) {
                case 'I':
                    x++;
                    break;
                case 'S':
                    y++;
                    break;
                case 'J':
                    y--;
                    break;
                case 'Z':
                    x--;
                    break;
            }
            if (set.contains(String.valueOf(x) + y)) sb.append(i + 1).append('\n');
        }
        if (sb.length() != 0) System.out.println(sb);
        else System.out.println(-1);
    }
}
