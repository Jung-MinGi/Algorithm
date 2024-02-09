import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static String[] arr;
    static String[][] brr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int score = 0;
        int anotherScore = 0;
        int n = Integer.parseInt(br.readLine());
        arr = new String[n];
        String y = br.readLine();
        for (int i = 0; i < n; i++) {
            arr[i] = String.valueOf(y.charAt(i));
        }
        int x = Integer.parseInt(br.readLine());
        brr = new String[x][n];
        for (int i = 0; i < x; i++) {
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                brr[i][j] = String.valueOf(str.charAt(j));
            }
        }

        //점수 계산
        for (int i = 0; i < n; i++) {
            String sang = arr[i];
            int s = 0;
            int p = 0;
            int r = 0;
            Stack<String> friend = new Stack<>();
            ArrayList<Character> list = new ArrayList<>();
            for (int j = 0; j < x; j++) {
                friend.add(brr[j][i]);
                list.add(brr[j][i].charAt(0));
            }
            anotherScore+=rockScissorPaperV2(list);
            while (!friend.isEmpty()) {
                score += rockScissorPaper(sang, friend.pop());
            }
        }
        System.out.println(score);
        System.out.println(anotherScore);
    }

    static int rockScissorPaperV2(ArrayList<Character> list) {
        int[] array = new int[4];// p r s
        for (Character s : list) {
            array[s - 80]++;
        }
        int a = array[0] * 2 + array[3];
        int b = array[2] * 2 + array[0];
        int c = array[3] * 2 + array[2];

        return Math.max(a, Math.max(b, c));

    }

    static int rockScissorPaper(String a, String b) {
        if (a.equals(b)) return 1;
        else {
            if (a.equals("S")) {
                if (b.equals("R")) return 0;
                else return 2;
            } else if (a.equals("P")) {
                if (b.equals("R")) return 2;
                else return 0;
            } else {
                if (b.equals("S")) return 2;
                else return 0;
            }
        }
    }
}
