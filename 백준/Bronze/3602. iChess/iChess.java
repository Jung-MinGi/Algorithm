import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
       int[] array = {};
       for(int i=0;i<=a;i++){
           for(int j=0;j<=b;j++){
               if(Math.abs(i-j)<=1){
                array = new int[]{i,j};
               }
           }
       }
       if(array[0]==0&&array[1]==0) System.out.println("Impossible");
        else System.out.println((int)Math.sqrt(array[0]+array[1]));
    }
}
