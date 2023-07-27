import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.IntToDoubleFunction;

public class Main {
    static class Answer {
        int x, y;

        public Answer(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        //Arrays.sort(arr);
        Answer answer = binarySearch(arr);
        System.out.println(answer.x+" "+answer.y);
    }

    static Answer binarySearch(int[] arr) {
        int a = 0;
        int b = 0;
        int min = Integer.MAX_VALUE;
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int num = arr[low] + arr[high];

            if (num == 0) {
                return new Answer(arr[low], arr[high]);
            } else if (min > Math.abs(num - 0)) {

                a = arr[low];
                b = arr[high];
                min = Math.abs(num - 0);
            }else if (num > 0) {
                high--;
            } else {
                low++;
            }


        }
        return new Answer(a, b);
    }
}



