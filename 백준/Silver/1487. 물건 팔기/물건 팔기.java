import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/**
 * 2508구글링,1487구글링
 */
public class Main {

    static int[][] arr;
    static int x=0;
    static int y=0;
    static PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
        @Override
        public int compare(int[] o1, int[] o2) {
            if(o1[1]==o2[1])return o1[0]-o2[0];
            else return o2[1]-o1[1];
        }
    });

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n][2];
        int max = 0;
        int min = 1000000;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            max = Math.max(arr[i][0], max);
            min = Math.min(arr[i][0],min);
        }
        for(int i=min;i<=max;i++){
            getProfit(i);
        }
        System.out.println(x);

    }
    static void getProfit(int price) {
        int ret = 0;//이익
        for (int[] ints : arr) {
            int a = ints[0];
            int b = ints[1];
            if (a >= price) {
                if (price< b) continue;
                ret += price - b;
            }
        }
        if(y<ret){
            x=price;
            y=ret;
        }else if(y==ret&&price<x){
            x=price;
            y=ret;
        }
    }

}


