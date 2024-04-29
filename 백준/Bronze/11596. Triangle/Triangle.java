import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] a = new int[3];
        int[] b = new int[3];

        for(int i=0;i<3;i++){
        a[i]=Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<3;i++){

            b[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<3;i++){
            if(a[i]!=b[i]){
                System.out.println("NO");
                return;
            }
        }
        if(Math.pow(a[0],2)+Math.pow(a[1],2)==Math.pow(a[2],2)){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}

