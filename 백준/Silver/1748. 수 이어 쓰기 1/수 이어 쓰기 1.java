import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;


public class Main {

    static int[][] arr;
    static Integer[] dp;
    static boolean[] visit = new boolean[10];
    static StringTokenizer st;
    static StringBuilder sb;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int a =Integer.parseInt(s);
        int num=9;
        int len=0;
        sb = new StringBuilder();
     
            for(int i=1; i<=s.length(); i++){
                if(i==s.length()){
                    int temp = (int)Math.pow(10,i-1);
                    len+=i*(a-(temp-1));

                    continue;
                }
                len+=i*num;
                num*=10;
           
        }
        System.out.println(len);
    }
}


