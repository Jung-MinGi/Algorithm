
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = i + 1;
        while(k-->0){
            st = new StringTokenizer(br.readLine());
            reverse(Integer.parseInt(st.nextToken())-1,Integer.parseInt(st.nextToken())-1,a);
        }
        for (int i : a) {
            System.out.print(i+" ");
        }
    }
    static void reverse(int start,int end,int[] a){
        for(int i=start,j=end;i<j;i++,j--){
            int tmp = a[i];
            a[i]=a[j];
            a[j]=tmp;
        }
    }
}
