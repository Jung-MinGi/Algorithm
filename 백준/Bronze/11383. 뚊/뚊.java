import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] a ;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        a = new char[n][m*2];
        for(int i=0;i<n;i++){
            String s = br.readLine();
            for(int j=0;j<s.length();j++){
                a[i][j*2]=s.charAt(j);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=1;j<a[i].length;j+=2){
                a[i][j]=a[i][j-1];
            }
        }
        for (char[] chars : a) {
            String s = br.readLine();
            StringBuilder sb = new StringBuilder();
            for (char aChar : chars) {
                sb.append(aChar);
            }
            if(!s.equals(sb.toString())){
                System.out.println("Not Eyfa");
                return;
            }
        }
        System.out.println("Eyfa");
    }
}

