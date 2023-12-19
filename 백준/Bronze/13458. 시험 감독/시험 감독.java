import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int max = Math.max(a,b);
        long answer=0;
        //총감독관 먼저 처리
        for(int i=0;i<n;i++){
            arr[i]-=a;
            answer++;
        }
        for(int i=0;i<n;i++){
            if(arr[i]<=0)continue;
            int tmp = arr[i] / b;
            answer+= tmp;
            arr[i]=arr[i]%b;
            if(arr[i]!=0&&arr[i]<=b) answer++;
        }
        System.out.println(answer);
    }
}
