import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static int min =36;
    static int x = 0;
    static int y = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        ArrayList<int[]>[] list = new ArrayList[a + 1];
        for (int i = 0; i <= a; i++) list[i] = new ArrayList<>();
        int idx = 0;
        for (int i = 1; i <= a; i++) {
            idx++;
            for (int j = 1; j <= 5; j++) {
                String s = br.readLine();
                for (int k = 0; k < s.length(); k++) {
                    if (s.charAt(k) == 'X') list[idx].add(new int[]{j, k});
                }
            }
        }
        for (int i = 1; i < a; i++) {
            for (int j = i + 1; j <= a; j++) {
                int cnt = soultion(list[i], list[j]);
                if (cnt < min) {
                    x = i;
                    y = j;
                    min = cnt;
                }
            }
        }
        System.out.println((x < y) ? x + " " + y : y + " " + x);
    }

    static int soultion(ArrayList<int[]> a, ArrayList<int[]> b) {
        int[][] arr = new int[6][8];
        for (int[] ints : a) {
            arr[ints[0]][ints[1]]++;
        }
        int ret = 0;
        for (int[] ints : b) {
            arr[ints[0]][ints[1]]++;
        }
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if(anInt==1)ret++;
            }
        }
        return ret;
    }
}

