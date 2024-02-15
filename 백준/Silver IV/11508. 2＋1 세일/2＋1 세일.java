import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(br.readLine());
        Integer[] arr  = new Integer[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr,(Integer a,Integer b)->b-a);
        int price=0;
        int count=1;
        for(int i=0;i<n;i++){
            if(count==3){
                count=1;
                continue;
            }
            price+=arr[i];
            count++;
        }
        System.out.println(price);
    }
}
