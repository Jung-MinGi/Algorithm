import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static int[] arr;
    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int flag = 0;
        for (int i : arr) {
            if (flag == 0) {
                list.add(i);
                flag = i % 2 == 0 ? 1 : -1;
            }
            else if(flag==1&&i%2==1){//홀수여야됨
                list.add(i);
                flag=-1;
            }else{
                if(flag==-1&&i%2==0){
                    list.add(i);
                    flag=1;
                }
            }
        }
        System.out.println(list.size());

    }
}