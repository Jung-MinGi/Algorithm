
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());//testcase
        for(int i = 0 ; i < t ; i++){
            st  = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int[] arr = new int[a];
            int[] brr = new int[b];
            st = new StringTokenizer(br.readLine());
            for (int q = 0 ; q < arr.length; q++){
                arr[q]=Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for (int w = 0 ; w < brr.length; w++){
                brr[w]=Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            Arrays.sort(brr);
            int cnt=0;
            for(int j : arr){
                for(int k : brr){
                    if (j > k){
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}

//이진탐색으로 구현

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());//testcase
        for(int i = 0 ; i < t ; i++){
            st  = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int[] arr = new int[a];
            int[] brr = new int[b];
            st = new StringTokenizer(br.readLine());
            for (int q = 0 ; q < arr.length; q++){
                arr[q]=Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for (int w = 0 ; w < brr.length; w++){
                brr[w]=Integer.parseInt(st.nextToken());
            }
            Arrays.sort(brr);
            int cnt=0;

            for(int j = 0 ; j < a; j++) {
                int low=0;
                int high=brr.length-1;
                while(low <= high){
                    int mid = (low+high) / 2;
                    if(brr[mid] < arr[j]){
                        low = mid + 1;
                    }else{
                        high = mid - 1;
                    }
                }
                cnt+=low;
            }
            System.out.println(cnt);
        }
    }
}