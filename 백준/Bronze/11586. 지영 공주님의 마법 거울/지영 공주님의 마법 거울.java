import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int N = Integer.parseInt(br.readLine());
       char[][] a = new char[N][N];
       for(int i=0;i<N;i++){
           String s = br.readLine();
           for(int j=0;j<N;j++){
               a[i][j]=s.charAt(j);
           }
       }
       int  p = Integer.parseInt(br.readLine());
       if(p==1){
           for (char[] chars : a) {
               for (char aChar : chars) {
                   System.out.print(aChar);
               }
               System.out.println();
           }
       }else if(p==2){
           for(int i=0;i<N;i++){
               for(int j=0;j<N;j++){
                   System.out.print(a[i][N-j-1]);
               }
               System.out.println();
           }
       }else{
           for(int i=0;i<N;i++){
               for(int j=0;j<N;j++){
                   System.out.print(a[N-i-1][j]);
               }
               System.out.println();
           }
       }
    }
}

