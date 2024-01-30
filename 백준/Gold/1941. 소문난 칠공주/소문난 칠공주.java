import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static Character[][] friend;
    static int[][] friendNum = new int[5][5];
    static int answer = 0;
    static int[] x = new int[25];
    static int[] y = new int[25];
    static boolean[] visitNum = new boolean[25];
    static HashSet<String> set = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        friend = new Character[5][5];
        for (int i = 0; i < 5; i++) {
            String s = br.readLine();
            for (int j = 0; j < 5; j++) {
                friend[i][j] = s.charAt(j);
            }
        }
        for (int i = 0; i < 25; i++) {
            x[i] = i / 5;
            y[i] = i % 5;
        }
//        for (int i = 0; i < 25; i++) {
            ArrayList<Integer> list = new ArrayList<>();
//            list.add(i);
//            visitNum[i] = true;
            pickSevenNum(list, 0);
//        }
        System.out.println(answer);
    }


    static void pickSevenNum(ArrayList<Integer> list, int idx) {
        if (list.size() == 7) {
            if (recursive(list)) answer++;
            return;
        }

        for (int i = idx; i < 25; i++) {
            if (!visitNum[i]) {
                visitNum[i] = true;
                list.add(i);
                pickSevenNum(list, i + 1);
                list.remove(list.size() - 1);
                visitNum[i] = false;
            }
        }

    }

    static boolean recursive(ArrayList<Integer> list) {
        int[] mx = new int[]{1, -1, 0, 0};
        int[] my = new int[]{0, 0, 1, -1};
        Queue<Integer> q = new LinkedList<>();
        int s = 0;
        int count = 1;
        boolean flag = false;
        boolean[] check = new boolean[7];
        check[0] = true;
        q.add(list.get(0));
        while (!q.isEmpty()) {
            Integer poll = q.poll();
            if (friend[x[poll]][y[poll]] == 'S') s++;
            for (int i = 0; i < 4; i++) {
                for (int next = 0; next < 7; next++) {
                    if (!check[next] && x[poll] + mx[i] == x[list.get(next)] && y[poll] + my[i] == y[list.get(next)]) {
                        check[next] = true;
                        q.add(list.get(next));
                        count++;
                    }
                }
            }
        }
        if (count == 7 && s >= 4) {
            return true;
        }
        return false;


    }
}