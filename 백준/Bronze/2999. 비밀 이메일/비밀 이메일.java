import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static char[][] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] soultion = soultion(s.length());
        arr = new char[soultion[0]][soultion[1]];
        int idx = 0;
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[j][i] = s.charAt(idx);
                idx++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                sb.append(arr[i][j]);
            }
        }
        System.out.println(sb);
    }

    static int[] soultion(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) list.add(i);
        }
        return new int[]{list.get(list.size() - 1), n / list.get(list.size() - 1)};
    }
}
