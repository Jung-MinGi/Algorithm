import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Objects;
import java.util.StringTokenizer;

class Main {
    static int answer = 2;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        soultion(0, arr);
        System.out.println(answer);
    }

    static void soultion(int cnt, int[][] arr) {
        if (cnt == 5) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    answer = Math.max(arr[i][j], answer);
                }
            }
            return;
        }

        int[][] tmp1 = arrayCopy(arr);
        int[][] tmp2 = arrayCopy(arr);
        int[][] tmp3 = arrayCopy(arr);
        int[][] tmp4 = arrayCopy(arr);
        soultion(cnt + 1, left(tmp3));
        soultion(cnt + 1, right(tmp4));
        soultion(cnt + 1, up(tmp1));
        soultion(cnt + 1, down(tmp2));
    }

    static int[][] arrayCopy(int[][] arr) {
        int[][] tmp = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                tmp[i][j] = arr[i][j];
            }
        }
        return tmp;
    }

    static int[][] down(int[][] arr) {
        ArrayList<Integer> list;
        for (int i = 0; i < arr.length; i++) {//y축
            list = new ArrayList<>();
            for (int j = arr.length - 1; j >= 0; j--) {
                if (arr[j][i] == 0) continue;
                list.add(arr[j][i]);
                arr[j][i] = 0;
            }
            ArrayList<Integer> tmp = getTmpArray(list);
            for (int k = 0; k < tmp.size(); k++) {
                arr[arr.length - 1 - k][i] = tmp.get(k);
            }
        }
        return arr;
    }

    private static ArrayList<Integer> getTmpArray(ArrayList<Integer> list) {
        ArrayList<Integer> tmp = new ArrayList<>();
        for (int l = 0; l < list.size(); l++) {
            if (list.get(l) == 0) continue;
            if (l == list.size() - 1) {
                tmp.add(list.get(l));
                continue;
            }
            if(Objects.equals(list.get(l), list.get(l + 1))){
                tmp.add(list.get(l) + list.get(l + 1));
                list.set(l, 0);
                list.set(l + 1, 0);
            continue;
                }
            tmp.add(list.get(l));
            list.set(l,0);
        }
        return tmp;
    }

    static int[][] up(int[][] arr) {
        ArrayList<Integer> list;
        for (int i = 0; i < arr.length; i++) {//y축
            list = new ArrayList<>();
            for (int j = 0; j < arr.length; j++) {
                if (arr[j][i] == 0) continue;
                list.add(arr[j][i]);
                arr[j][i] = 0;
            }
            ArrayList<Integer> tmp = getTmpArray(list);
            for (int k = 0; k < tmp.size(); k++) {
                arr[k][i] = tmp.get(k);
            }
        }
        return arr;
    }

    static int[][] right(int[][] arr) {
        ArrayList<Integer> list;
        for (int i = 0; i < arr.length; i++) {
            list = new ArrayList<>();
            for (int j = arr[i].length - 1; j >= 0; j--) {
                if (arr[i][j] == 0) continue;
                list.add(arr[i][j]);
                arr[i][j] = 0;
            }
            ArrayList<Integer> tmp = getTmpArray(list);
            for (int k = 0; k < tmp.size(); k++) {
                arr[i][arr[i].length - 1 - k] = tmp.get(k);
            }
        }
        return arr;
    }

    static int[][] left(int[][] arr) {
        ArrayList<Integer> list;
        for (int i = 0; i < arr.length; i++) {
            list = new ArrayList<>();
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) continue;
                list.add(arr[i][j]);
                arr[i][j] = 0;
            }
            ArrayList<Integer> tmp = getTmpArray(list);
            for (int k = 0; k < tmp.size(); k++) {
                arr[i][k] = tmp.get(k);
            }
        }
         return arr;
    }
}
