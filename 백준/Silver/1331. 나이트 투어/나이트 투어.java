import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class Main {
    static int[][] arr = new int[6][6];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 36;
        int[] dx = new int[]{-2, -1, 1, 2, 2, 1, -1, -2};
        int[] dy = new int[]{1, 2, 2, 1, -1, -2, -2, -1};
        ArrayList<int[]> list = new ArrayList<>();
        while (n-- > 0) {
            String s = br.readLine();
            int y = s.charAt(0) - 'A';
            int x = 6 - (s.charAt(1) - '0');
            list.add(new int[]{x,y});

        }
        for (int i = 0; i < list.size(); i++) {
            int[] ints = list.get(i);
            if(i==list.size()-1){
                arr[ints[0]][ints[1]]++;
                break;
            }
            int[] tmp = list.get(i + 1);
            for (int j = 0; j < dx.length; j++) {
                int nx = dx[j] + ints[0];
                int ny = dy[j] + ints[1];
                if(tmp[0]==nx&&tmp[1]==ny){
                    arr[ints[0]][ints[1]]++;
                    break;
                }
            }
        }




        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > 1 || anInt == 0) {
                    System.out.println("Invalid");
                    return;
                }
            }
        }
        int[] ints = list.get(0);
        int[] tmp = list.get(list.size() - 1);
        for (int j = 0; j < dx.length; j++) {
            int nx = dx[j] + tmp[0];
            int ny = dy[j] + tmp[1];
            if(ints[0]==nx&&ints[1]==ny){
                System.out.println("Valid");
                return;
            }
        }
        System.out.println("Invalid");
    }

}
