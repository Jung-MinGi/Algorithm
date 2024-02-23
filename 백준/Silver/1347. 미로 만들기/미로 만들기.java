import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static Character[] arr;
    public static char[][] board = new char[100][100];
    static int n;
    static HashMap<Character, int[]> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        board[50][50] = '*';
        map.put('N', new int[]{-1, 0});
        map.put('R', new int[]{0, 1});
        map.put('L', new int[]{0, -1});
        map.put('D', new int[]{1, 0});
        n = Integer.parseInt(br.readLine());
        arr = new Character[n];
        String s = br.readLine();
        for (int i = 0; i < n; i++) {
            arr[i] = s.charAt(i);
        }
        int minx = 50;
        int miny = 50;
        int maxx = 50;
        int maxy = 50;
        Character currentView = 'D';
        int currentX = 50;
        int currenty = 50;
        for (Character c : arr) {
            if (c == 'F') {
                int[] ints = map.get(currentView);
                currentX = currentX + ints[0];
                currenty = currenty + ints[1];
                board[currentX][currenty] = '*';
                if (minx > currentX) minx = currentX;
                else if (maxx < currentX) maxx = currentX;
                if (miny > currenty) miny = currenty;
                else if (maxy < currenty) maxy = currenty;
            } else {
                if (c == 'L') {
                    if (currentView == 'D') currentView = 'R';
                    else if (currentView == 'R') currentView = 'N';
                    else if (currentView == 'N') currentView = 'L';
                    else currentView = 'D';
                } else {
                    if (currentView == 'D') currentView = 'L';
                    else if (currentView == 'R') currentView = 'D';
                    else if (currentView == 'N') currentView = 'R';
                    else currentView = 'N';
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = minx; i <= maxx; i++) {
            for (int j = miny; j <= maxy; j++) {
                char c = board[i][j] == '*' ? '.' : '#';
                sb.append(c);
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
