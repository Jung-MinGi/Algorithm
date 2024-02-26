import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int n, k;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        if (n == 1) {
            System.out.println(1);
            return;
        }
        if(sol(arr)==k){
            for (int i : arr) {
                System.out.print(i+" ");
            }
            return;
        }
        while (true) {
            next_permutation();
            if (sol(arr) == k) {
                for (int i : arr) {
                    System.out.print(i + " ");
                }
                break;
            }
        }
    }


    static void next_permutation() {
        int i = arr.length - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) i--;
        int pivot = i;
        if (pivot < 0) return;
        int j = arr.length - 1;
        while (j > pivot && arr[pivot] >= arr[j]) {
            j--;
        }
        //swap
        swap(pivot, j);
        //
        pivot++;
        j = arr.length - 1;
        while (pivot < j) {
            swap(pivot, j);
            pivot++;
            j--;
        }
    }

    static void swap(int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    static int sum() {
        Integer[][] tmp = new Integer[n][n];
        for (int i = 0; i < arr.length; i++) {
            tmp[0][i] = arr[i];
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j + 1 >= arr.length || tmp[i - 1][j + 1] == null) break;
                tmp[i][j] = tmp[i - 1][j] + tmp[i - 1][j + 1];
            }
        }
        return tmp[arr.length - 1][0];
    }

    public static int sol(int[] temp) {
        if(temp.length==2) {        //마지막 수 리턴
            return temp[0]+temp[1];
        }

        int[] next = new int[temp.length-1];
        int i = 0;
        int j = 1;

        while(j<temp.length) {
            next[i] = temp[i]+temp[j];
            i++;
            j++;
        }

        return sol(next);
    }
}