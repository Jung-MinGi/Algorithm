import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int n;
    static int[] arr;
    static int[] answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        answer = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        answer[0] = arr[0];
        int len = 1;
        for (int i = 1; i < n; i++) {
            int num = arr[i];
            if(answer[len-1]<num){
                len++;
                answer[len-1]=num;

            }else{
                int low=0;
                int high=len;
                while(low<high){
                    int mid = (low+high)/2;
                    if(answer[mid] < num){
                        low=mid+1;
                    }else{
                        high=mid;
                    }
                }
                answer[low]=num;
            }
        }
        System.out.println(len);
    }
}


