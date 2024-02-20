import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    static Integer[] arr = new Integer[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=2;i<Math.sqrt(arr.length);i++){
            if(arr[i]!=null&&arr[i]==-1)continue;
            for(int j=i*i;j<arr.length;j+=i){
                arr[j]=-1;
            }
        }
        arr[0]=arr[1]=-1;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int cnt=0;
        for(int i=a;i<=b;i++){
            if(arr[i]==null)continue;
            if(soultion(i))cnt++;
        }
        System.out.println(cnt);
    }
    static boolean soultion(int num){
        int a=0;
        for(int i=2;i<=Math.sqrt(num);i++){
            while (num%i==0){
                num=num/i;
                a++;
            }
            if(num==1)break;
        }
        if(arr[num]==null)a++;
        return arr[a] == null;
    }

}