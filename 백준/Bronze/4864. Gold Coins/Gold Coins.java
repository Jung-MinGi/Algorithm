import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[10001];
        int prev=1;
        boolean flag=false;
        for(int i=1;;i++){
            int j =0;
            for(j=prev;j<prev+i;j++){
                if(j>=a.length){
                    flag=true;
                    break;
                }
                a[j]=i;
            }
            prev=j;
            if(flag)break;
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            sb.append(n).append(' ');
            int sum=0;
            for(int i=1;i<=n;i++)sum+=a[i];
            sb.append(sum).append('\n');
        }
        System.out.println(sb);
    }
}
